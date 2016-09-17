package ProgrammingInScala.Chapter8

object ShortFormFunctionLiterals extends App {
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.filter(x => x> 0).foreach(println)
  
  someNumbers.filter( _ > 0).foreach(println)
  
  val f = ( _ :Int) + ( _ :Int)
  
  println(f(1,2))
  
  
  var sum = 0
  
  someNumbers.foreach( sum += _ )
  
  println(sum)
  
  
}