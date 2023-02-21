package com.dicoding.kotlin

fun stringTemplate() {
  val name = "Kotlin"
  print("My name is " + name)

  print("My name is $name")

  val old = 3
  print("My name is $name, im $old years old")

  val hour = 7
  print("Office ${if (hour > 7) "already close" else "is open"}")
}