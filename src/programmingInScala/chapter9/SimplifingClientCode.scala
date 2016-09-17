package programmingInScala.chapter9

object SimplifingClientCode extends App {
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }
  println(containsNeg(List(1, 2, 3, 4)))
}