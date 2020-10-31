const router=require("express").Router(),
    passport=require("passport"),
    User=require("../modules/user");


router.route("/login")
    .get((req,res,next)=>{
        res.render("login");
    })
    .post( passport.authenticate( 'login' , { failureRedirect : '/Login' } ),
    (req,res,next)=>{
        console.log(res.locals);
        res.redirect("/Notes");
    })
    
router.route("/signup")
.get((req,res,next)=>{
    res.render("signup");
})
.post((req,res,next)=>{
    User.createUser(req.body.username,req.body.password,(error,user)=>{
        if(error) return next(error);
        console.log(user);
        req.logIn(user,(err)=>{
            if(err) return next(err);
            res.redirect("/");
        });
    })
    
})

router.get("/logout",(req,res)=>{
    req.logout();
    res.redirect("/login");
})

module.exports=router;