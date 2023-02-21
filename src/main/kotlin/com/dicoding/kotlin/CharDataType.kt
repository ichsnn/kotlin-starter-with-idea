package com.dicoding.kotlin

fun CharDataType() {
  // Char use single quation ('')
  val character = 'A'
  // val character1: Char = 'ABS' // Incorect character literal

  // We can run operation like increament (++) and decreament (--) for a char variable
  var vocal = 'A'

  println("Vocal " + vocal++)
  println("Vocal " + vocal++)
  println("Vocal " + vocal++)
  println("Vocal " + vocal++)
  println("Vocal " + vocal--)
  println("Vocal " + vocal--)
  println("Vocal " + vocal--)
  println("Vocal " + vocal--)
  println("Vocal " + vocal--) // output: A
}