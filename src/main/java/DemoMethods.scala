
object DemoMethods {

  def run() = {

    println("========== Demo Methods ==========")

    println(add(5, 5))
    println(addThenMultiply(5,5)(10))
    println("Hello " + name)
    println(getSquareString(5.5))
  }

  def add(x: Int, y: Int): Int = x+y

  def addThenMultiply(x: Int, y: Int)(multiplier: Int) : Int = (x + y ) * multiplier

  def name: String = System.getProperty("user.name")

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString()
  }
}