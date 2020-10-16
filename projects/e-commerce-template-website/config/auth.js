const passport = require("passport");

module.exports = {
  ensureAuth: function (req, res, next) {
    if (req.isAuthenticated()) {
      return next();
    }
    res.redirect("/users/login");
  },
  ensureNotAuth: function (req, res, next) {
    if (!req.isAuthenticated()) {
      return next();
    }
    res.redirect("/addtocart");
  },
};
