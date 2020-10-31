const port=3000;
//include express
const express=require("express"),
//include db
    mongoose = require("mongoose"),
//include session requirments
    passport = require("passport"),
    LocalStrategy = require("passport-local"),
    expressSession = require("express-session")(
        {
            secret            : "s65d1fs65fg1df65gd1f6g5d4fgvdfrgb1d65fg1sd6f514sd6f5s4df1r86s1hqztsrj1fgq" ,
            resave            : false ,
            saveUninitialized : false ,
        } ) ,
//parser    
    bodyParser   = require( 'body-parser' ) ,
    cookieParser = require('cookie-parser'),
//include the debuger
    logger = require('morgan'),
//include the user manager
    User=require("./modules/user"),
//create the app
    app=express();

//create strategy 
strategy = new LocalStrategy(
    {
        usernameField: "username",
        passwordField: "password",
    },
    async (username, password, done) => {
        try {
            let user = await User.model.findOne({ username });
            if (!user) return done(null, false, { message: "Incorrect username" });
            user = (await user.authenticate(password)).user;
            if (!user) return done(null, false, { message: "Incorrect password" });
            return done(null, user.toObject());
        } catch (e) {
            return done(null, false, { message: e.message });
        }
    }
);

//public files
app.use("/public",express.static("./public"))
// view engine
app.set( 'views' , require("path").join( __dirname , 'views' ) );
app.set( 'view engine' , 'ejs' );

//link the session settings to the application
app.use(expressSession);
app.use(passport.initialize({}));
app.use(passport.session({}));
passport.use("login", strategy);
passport.serializeUser(function (user, done) { done(null, user._id);});
passport.deserializeUser(async function (id, done) {
    try {
        let user = await User.model.findById(id);
        done(null, user);
    } catch (e) {
        console.error("deserialized", e);
        done(e);
    }
});
//parsers
app.use( cookieParser() );
//app.use( bodyParser.json() );
app.use( bodyParser.urlencoded( { extended : true } ) );

//debug 
app.use(logger('dev'));

//Add user to the routes
app.use((req,res,next)=>{
    res.locals.User = req.user ? { _id:req.user._id , username:req.user.username} : undefined;
    next();
})
//routes
app.use("/",require("./routes/index"))
app.use("/Notes",require("./middlewares/login").isLoggedIn,require("./routes/notes"))
app.use("/",require('./routes/user'))


//database lunching 
mongoose
    .connect('mongodb+srv://MicroNote:MicroNote@cluster0.2i8zz.mongodb.net/MicroNote?retryWrites=true&w=majority', {
        useNewUrlParser: true,
        useCreateIndex: true,
        useUnifiedTopology: true,
        dbName: "Micro_Note",
    })
    .then((connection) => {
        console.log("db connected");
        mongoose.set("debug", true);
    })
    .catch((reason) => {
        console.error(reason);
        process.exit(-1);
    });
//app listen
app.listen(port,function(){
    console.log("listining to the port : "+port)
})