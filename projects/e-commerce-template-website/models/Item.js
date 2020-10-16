const mongoose = require("mongoose");

const itemSchema = new mongoose.Schema({
  name: { type: String, required: true },
  description: {
    type: String,
  },
  price: {
    type: String,
    required: true,
  },
  countInStock: {
    type: String,
    required: true,
    default: "1",
  },
});

const Item = mongoose.model("Item", itemSchema);

module.exports = Item;
