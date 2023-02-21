package com.dicoding.kotlin

fun IfExpressions() {
  val openHours = 7
  val now = 20
  val office: String
  office = if (now > openHours) {
    "Office already open"
  } else if (now == openHours) {
    "Wait a minute, office will be open"
  } else {
    "Office is close"
  }
  println(office)
}