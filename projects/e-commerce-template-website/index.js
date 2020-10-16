const express = require("express");
const mongoose = require("mongoose");
const flash = require("connect-flash");
const expressLayouts = require("express-ejs-layouts");
const session = require("express-session");
const passport = require("passport");
const app = express();

// body parser
app.use(express.urlencoded({ extended: false }));

//passport config
require("./config/passport")(passport);

// connect db
const db = require("./config/mongo").mongoUri;
mongoose
  .connect(db, {
    useUnifiedTopology: true,
    useNewUrlParser: true,
  })
  .then(() => console.log("mongo connected..."))
  .catch((err) => console.log(err));

// ejs middleware
app.use(expressLayouts);
app.set("view engine", "ejs");

// static folder
app.use("/css", express.static("css"));

//session middleware
app.use(
  session({
    secret: "secret",
    resave: true,
    saveUninitialized: true,
  })
);

//passport middleware
app.use(passport.initialize());
app.use(passport.session());

// flash middleware
app.use(flash());

//routes
app.use("/", require("./routes/index"));
app.use("/users", require("./routes/users"));

const PORT = process.env.PORT || 5000;

app.listen(PORT, () => console.log(`server started on port ${PORT}`));
