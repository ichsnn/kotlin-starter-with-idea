package com.dicoding.kotlin

fun numbers() {
  // Int (32 Bit)
  val intNumber: Int = 100
  val intNumber1 = 100

  // Long (64 Bit)
  val longNumber: Long = 100
  val longNumber1 = 100L

  // Short (16 Bit)
  val shortNumber: Short = 10

  // Byte (8 Bit)
  val byteNumber = 0b11010100

  // Double (64 Bit)
  val doubleNumber: Double = 1.3

  // Float (32 Bit)
  val floatNumber: Float = 0.12345678f // harus dikasih f di akhir

  val maxInt = Int.MAX_VALUE
  val minInt = Int.MIN_VALUE

  println(maxInt)
  println(minInt)
  /*
    output :
    2147483647
    -2147483648
  */

  val maxInt1 = Int.MAX_VALUE
  val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

  println("Max Int: $maxInt")
  println("Over range Int: $overRangeInt")
  /*
    Output :
    Max Int: 2147483647
    Over range Int: -2147483648
  */

  // Konversi
  val stringNumber = "23"
  val intNumber2 = 3

  print(intNumber + stringNumber.toInt())
  /*
    output: 26
  */

  // Readable Number use _ (underscore) as symbol
  val readableNumber = 1_000_000
  print(readableNumber)

  /*
    output : 1000000
  */
}