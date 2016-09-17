package programmingInScala.chapter7

object ReadLine {
  
  def main (args: Array[String])={
    var line = ""
    do{
      line = readLine()
      println(s"Read: $line")
    }while (line != "")
    
  }
}