package ProgrammingInScala.chapter9

object Test extends App{
  val format = new java.text.SimpleDateFormat("dd/MMM/yy hh:mm:ss.SSSSSSSSS a")
  val myDate = format.parse("09/SEP/16 09:20:00.000000000 PM")
  val df = new java.text.SimpleDateFormat("dd-mm-yyyy hh:mm a")
  df.format(myDate)
  println(df.format(myDate))
}