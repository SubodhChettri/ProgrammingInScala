package ProgrammingInScala.Chapter8

object FindLongLines {
    def main(args: Array[String]) = {
      val width = args(0).toInt
      for (arg <- args.drop(1))
        ProgrammingInScala.Chapter8.LongLines.processFile(arg, width)
    }
  }
