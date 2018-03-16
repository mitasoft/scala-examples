
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

    val point1 = new Point2(10, 10)
    println(point1)

    point1.move(5,5)
    println(point1)

    val point2 = new Point2()
    println(point2)

    val point3 = new Point2(y = 10)
    println(point3)

    val point4 = new Point3()
    point4.x = 100

    println(point4)


  }

}
