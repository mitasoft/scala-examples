
object DemoClasses {

  case class Point(x: Int, y: Int)

  def run(): Unit = {

    println("========== Demo Classes ==========")

    val greeter = new Greeter("Hello, ", "!!!!")
    greeter.greet("dude")

    val point = Point(1,2)
    val anotherPoint = Point(1,2)
    val thirdPoint = Point(2,2)

    if (point == anotherPoint) {
      println(s"$point and $anotherPoint are the same")
    } else {
      println(s"$point and $anotherPoint are different")
    }

    if (point == thirdPoint) {
      println(s"$point and $thirdPoint are the same")
    } else {
      println(s"$point and $thirdPoint are different")
    }

  }

}
