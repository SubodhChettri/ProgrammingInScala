package programmingInScala.chapter7

object GCD {
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def main(args: Array[String]) {
    var a = 35
    var b = 75
    println(s"GCD($a,$b) = ${gcdLoop(a, b)}"  )
  }
}