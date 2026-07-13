
@main
def main(): Unit = {
  object User {
    def getUserName = "shit"
  }

  def square = (n:Int) => n*n
  val block = CodeBlock("for (i <- 1 to 5) {\n    val iSquare = square(i)\n    println(s\"i = $iSquare\")\n  }", "myownstyle","main.scala")
  println(block.data)
  for (i <- 1 to 5) {
    val iSquare = square(i)
    println(s"i = $iSquare")
  }
}
