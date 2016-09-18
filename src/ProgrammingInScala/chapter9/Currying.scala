package programmingInScala.chapter9

object Currying extends App {
  def plainOldSum(x: Int, y: Int) = y + x
  println(plainOldSum(1, 2))

  def curriedSum(x: Int)(y: Int) = x + y
  println(curriedSum(1)(2))
  
  def first(x: Int) = (y: Int) => x + y
  
  val second = first(1)
  println(second(2))
  
  println(second(5))
  
  val onePlus = curriedSum(1)_
  println(onePlus(4))
  
  val twoPlus = curriedSum(2)_
  println(twoPlus(4))
  
  
  
}