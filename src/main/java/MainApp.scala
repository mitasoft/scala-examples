
object MainApp {

  def main(args: Array[String]) : Unit = {

    println("App is running")

    basics()

    val demoMethods = DemoMethods.run()

  }


  def basics() = {
    println("========== basics ==========")

    println(1+1)
    println("Hello")
    println("Hello" + " , " + "world !")

    val x = 2 + 2
    //x = 4 //not working
    println(x)

    val y: Int = 5 + 5
    println(y)

    var k = 1 + 1
    k = 5
    println(k * k)


    println({
      val x = 1 + 1
      x + 1
    }) // 3


    val addOne = (x: Int) => x + 1
    println(addOne(5)) // 6

    val add = (x: Int, y: Int) => x + y
    println(add(6,6)) // 12

    val theAnswer = () => 42
    println(theAnswer())
  }

}