package programmingInScala.chapter7

object CheckArgs {
  def main (args: Array[String])={
    if(args.isEmpty)
      println("Hello World")
    else
      println("Hello "+ args(0))  
  }
}