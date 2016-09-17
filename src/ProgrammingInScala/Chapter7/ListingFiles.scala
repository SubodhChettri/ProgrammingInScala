package ProgrammingInScala.Chapter7
import java.nio.file.Paths
import java.io.File

object ListingFiles {
  def main (args: Array[String])={
    
    val currentDir = Paths.get("").toAbsolutePath().toString()+"\\Chapter7\\"
    val filesHere = (new File(".")).listFiles()
    println(s"Current working directory: $currentDir")
    for (
        file <- filesHere
        if( file.isFile())
        if(file.getName.endsWith(".scala"))
    ){
      println(file)
    }
  }
}