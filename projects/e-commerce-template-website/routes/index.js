const router = require("express").Router();
const Item = require("../models/Item");
const { ensureAuth } = require("../config/auth");

//homapage route
router.get("/", (req, res) => {
  Item.find()
    .then((products) => {
      res.render("homepage", { products });
    })
    .catch((err) => console.log(err));
});

//add product route
router.get("/addproduct", ensureAuth, (req, res) => {
  res.render("addproduct");
});

//item route
router.get("/product/:id", (req, res) => {
  Item.findOne({ _id: req.params.id })
    .then((newProduct) => {
      if (newProduct) {
        res.render("item", { newProduct });
      } else {
        res.redirect("/");
      }
    })
    .catch((err) => console.log(err));
});

// handle adding a product
router.post("/addproduct", (req, res) => {
  const { name, description, price } = req.body;
  const newProduct = new Item({ name, description, price });
  newProduct
    .save()
    .then((product) => {
      res.render("item", { newProduct });
    })
    .catch((err) => console.log(err));
});

module.exports = router;
