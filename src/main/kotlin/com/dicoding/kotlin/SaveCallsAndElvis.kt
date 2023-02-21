package com.dicoding.kotlin

fun saveCallsAndElvis() {
  val text: String? = null

  // Safe calls operator ?.
  text?.length

  // Elvis Operator ?:
  val textLength = text?.length ?: 7

  // Elvis Operator is Like
  val textLength1 = if (text != null) text.length else 7

  // Non Null Asertion !!
  // val textLength2: Number? = text!!.length // ready to go ???

}