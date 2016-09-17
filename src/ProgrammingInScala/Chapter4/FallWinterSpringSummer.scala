package ProgrammingInScala.Chapter4
import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {

  //for (season <- List("fall", "winter", "spring"))
  //  println(season + ": " + calculate(season))
  List("fall", "winter", "spring").foreach ( x => prn(x) )
  def prn(arg: String)={
    println(arg + ": " + calculate(arg))
  }
}