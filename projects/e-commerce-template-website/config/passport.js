const strategy = require("passport-local").Strategy;
const mongoose = require("mongoose");
const User = require("../models/User");

module.exports = function (passport) {
  passport.use(
    new strategy({ usernameField: "email" }, (email, password, done) => {
      User.findOne({ email: email })
        .then((user) => {
          if (!user) {
            consile.log("!user");
            return done(null, false, { msg: "Email is not registered" });
          }

          if (password === user.password) {
            return done(null, user);
          } else {
            console.log("password incorrect");
            return done(null, false, { msg: "Password is incorrect" });
          }
        })
        .catch((err) => console.log(err));
    })
  );

  passport.serializeUser((user, done) => {
    done(null, user.id);
  });

  passport.deserializeUser((id, done) => {
    User.findById(id, function (err, user) {
      done(err, user);
    });
  });
};
