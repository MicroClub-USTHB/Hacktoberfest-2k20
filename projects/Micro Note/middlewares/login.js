const { models } = require("mongoose");

module.exports={
    isLoggedIn:function(req,res,next){
        if(req.user) return next();
        else res.redirect("/login");
    }
}