package programmingInScala.chapter8

object SpecialFunctionCallForms extends App {
  def echo(args: String* ) =
    for (arg <- args) println(arg)

  echo("Hello", "World", "How", "are", "you")
  
  
  val arr: Array[String] = Array ("Hello", "World", "How", "are", "you")
  
  echo (arr: _*)
  
  def divide(number : Int, divisior : Int = 1)={
      number/ divisior
    }
  println(divide (10))
  println(divide (10,2))
  
}