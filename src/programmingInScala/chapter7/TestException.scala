package programmingInScala.chapter7
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
object TestException extends App {
  try {
    val f = new FileReader("input.txt")
    // Use and close file
  } catch {
    case ex: FileNotFoundException => // Handle missing file
      println("File Not Found")
    case ex: IOException => // Handle other I/O error
  } finally {
    println("To The file Block")
  }

}