package programmingInScala.chapter8

object FindLongLines {
    def main(args: Array[String]) = {
      val width = args(0).toInt
      for (arg <- args.drop(1))
        programmingInScala.chapter8.LongLines.processFile(arg, width)
    }
  }
