const mongoose = require('mongoose');
const Schema = mongoose.Schema;
mongoose.set('useCreateIndex', true);
const userSchema = new Schema({
  name: {
    type: String,
    required: true,
    trim: true
  },
  email: {
    type: String,
    required: true,
    trim: true,
    unique: true
  },
  password: {
    type: String,
    required: true,
    trim: true
  },
  type: {
    type: String,
    required: true,
    trim: true
  },
  paso1: {
    type: String,
    default:"no"
  },
  paso2: {
    type: String,
    default:"no"
  },
  paso3: {
    type: String,
    default:"no"
  },
  paso4: {
    type: String,
    default:"no"
  },
  paso5: {
    type: String,
    default:"no"
  }
}, {
    timestamps: true
  });
module.exports = userSchema;