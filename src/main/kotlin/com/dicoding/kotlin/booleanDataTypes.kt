package com.dicoding.kotlin

fun booleanDataTypes() {
  val officeOpen = 7
  val officeClosed = 16
  val now = 20

  // val isOpen = if (now >= officeOpen && now <= officeClosed) {
  //   true
  // } else {
  //   false
  // }

  val isOpen = now >= officeOpen && now <= officeClosed

  val isClose = now < officeOpen || now > officeClosed

  println("Office is open: $isOpen")
  println("Office is close: $isClose")

  if (!isOpen) {
    println("Office is closed")
  } else {
    println("Office is open")
  }
}

/*
  output : Office is open: false
*/