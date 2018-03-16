import scala.runtime.Nothing$

object DemoTypes {

  def run(): Unit = {

    println("========== Demo Types ==========")

    val list: List[Any] = List(
      "a string",
      700,
      'c',
      true,
      ()=> "an anonymous function returning a string"
    )

    list.foreach(e => println(e))

    typeCasting()

  }


  def typeCasting() = {

    val x: Long = 987654321
    val y: Float = x

  }

}
