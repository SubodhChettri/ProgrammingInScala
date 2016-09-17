package ProgrammingInScala.Chapter7

object MatchCase {
  def main(args: Array[String]) = {
    //val firstArg = if (args.length > 0) args(0) else ""
    for (firstArg <- args)
      firstArg match {
        case "salt"  => println("pepper")
        case "chips" => println("salsa")
        case "eggs"  => println("bacon")
        case _       => println("huh?")
      }
  }

}