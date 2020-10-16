const router = require("express").Router();
const mongoose = require("mongoose");
const User = require("../models/User");
const passport = require("passport");
const { ensureNotAuth } = require("../config/auth");
//get login
router.get("/login", ensureNotAuth, (req, res) => {
  res.render("login");
});

router.get("/register", ensureNotAuth, (req, res) => {
  res.render("register");
});

//register handle
router.post("/register", (req, res) => {
  const { name, email, password } = req.body;

  let errors = [];
  if (!name || !email || !password) {
    errors.push({ msg: "Please fill in all fields" });
  }

  if (password.length < 6) {
    errors.push({ msg: "Password should be at least 6 chracters" });
  }

  if (errors.length > 0) {
    res.render("register", { errors, name, email, password });
  } else {
    User.findOne({ email: email })
      .then((user) => {
        if (user) {
          errors.push({ msg: "Email already exists" });
          res.render("register", { errors, name, email, password });
        } else {
          const newUser = new User({ name, email, password });

          // hash password

          // save user
          newUser
            .save()
            .then((user) => {
              res.redirect("/users/login");
            })
            .catch((err) => console.log(err));
        }
      })
      .catch((err) => console.log(err));
  }
});

//login handle
router.post("/login", (req, res, next) => {
  passport.authenticate("local", {
    successRedirect: "/addproduct",
    failureRedirect: "/users/register",
    failureFlash: true,
  })(req, res, next);
});

//logout
router.get("/logout", (req, res) => {
  req.logOut();
  res.redirect("/users/login");
});

module.exports = router;
