package com.dicoding.kotlin

fun nullableTypes() {
  // val text: String = null // compile time error
  val text: String? = null // ready to go
  // val textLenght = text.length // compile time error
  val textLength: Number
  if(text != null) {
    textLength = text.length
  }
}