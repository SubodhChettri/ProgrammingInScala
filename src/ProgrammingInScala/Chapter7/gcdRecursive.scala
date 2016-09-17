package ProgrammingInScala.Chapter7

object gcdRecursive {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }

  def main (args: Array[String]){
    val a = 75
    val b = 27
    println(s"GCD($a, $b) = ${gcd(a,b)}" )
  }
}