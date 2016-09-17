package programmingInScala.chapter6

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational) = new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom)

  def +(i: Int) = new Rational(this.numer + i * this.denom, denom)

  def -(that: Rational) = new Rational(this.numer * that.denom - this.denom * that.numer, this.denom * that.denom)

  def -(i: Int) = new Rational(this.numer - i * this.denom, denom)

  def *(that: Rational) = new Rational(this.numer * that.numer, this.denom * that.denom)

  def *(i: Int) = new Rational(this.numer * i, this.denom)

  def /(that: Rational) = new Rational(this.numer * that.denom, this.denom * that.numer)

  def /(i: Int) = new Rational(this.numer, this.denom * i)

  override def toString = numer +" / "+denom
  
  private def gcd (a : Int , b: Int): Int ={
    if(b==0)
      a
    else
      gcd(b, a % b)
  }
}