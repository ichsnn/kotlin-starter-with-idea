package com.dicoding.kotlin

fun StringDataType() {
  val text = "Kotlin"
  val firstChar = text[0]

  println("First character of $text is $firstChar") // output: First character of Kotlin is K

  for (char in text) {
    print("$char ")
  }
  println()
  /*
    output: K o t l i n
  */

  // escaped string
  val statement = "Kotlin is \"Awesome!\""

  // try to add unicode to string
  val name = "Unicode test: \u00A9"
  println(name) // output: Unicode test : ©

  val line = "Line 1\n" +
      "line 2\n" +
      "line 3\n" +
      "line 4"
  // with raw string we can create like this
  val lineRaw = """
    Line 1
    Line 2
    Line 3
    Line 4
  """.trimIndent()

  println(lineRaw)
}