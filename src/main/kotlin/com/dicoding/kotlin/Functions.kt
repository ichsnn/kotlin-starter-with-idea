package com.dicoding.kotlin

fun Functions() {
  val user = setUser("Ichsan", 20)
  println(user)
  printUser("Ichsan")

  /* output
  Your name is Ichsan and you 20 years old
  Your name is Ichsan
  */

}

/*
  fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
  }
*/

fun setUser(name: String, age: Int): String {
  return "Your name is $name, and you $age years old"
}

fun printUser(name: String): Unit {
  println("Your name is $name")
}