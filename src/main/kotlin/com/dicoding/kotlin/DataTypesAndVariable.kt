package com.dicoding.kotlin

fun DataTypesAndVariable() {
  // identifier: Type = initialization
  // example :
  var company: String = "Dicoding"

  /*
    with var we can change the value that has been initialization
    example to change the var value company above
  */
  company = "Dicoding Academy"

  /*
    with val we can't change the value
    example
  */
  // val company1: String = "Dicoding"
  // company = "Dicoding Academy" // val cannot be reassigned, this is will be error

  val firstWord = "Dicoding "
  val lastWord = "Academy"
  println(firstWord + lastWord) // output: Dicoding Academy

  val valueA: Int = 10
  val valueB = 20
  println(valueA + valueB) // output: 30
}