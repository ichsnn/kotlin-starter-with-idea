package com.dicoding.kotlin

fun arrays() {
  val array = arrayOf(1, 3, 5, 7)
  val mixArray = arrayOf(1, 3, 5, "Dicoding", true)

  val intArray = intArrayOf(1, 3, 5, 7)

  println(intArray[2]) // 5

  intArray[2] = 11

  println(intArray[2]) // 11
}