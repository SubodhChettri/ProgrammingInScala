package programmingInScala.chapter7
import java.io.File

object Grep extends App {
  val filesHere = (new File("D:/sandbox/Repos/ProgrammingInScala/src/ProgrammingInScala/Chapter7/")).listFiles()
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String) =
    for (
      file <- filesHere if (file.getName.endsWith(".scala"));
      line <- fileLines(file) if (line.trim.matches(pattern))
    ) println(s"$file  :  $line.trim")
  grep(".*gcd.*")

  def scalaFile =
    for (
      file <- filesHere if (file.getName.endsWith(".scala"))
    ) yield file;

  val forLineLength =
    for {
      file <- filesHere if file.getName.endsWith(".scala");
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length
   forLineLength.foreach { x => println(s"\n $x") } 
  
}