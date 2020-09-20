object Main extends App {
  val f1 = new Fibonacci()

  println("fibCycle")
  println(time {
    f1.fibCycle(10)
  })

  println("fibTailFibRec")
  println(time {
    f1.fibTailRec(10)
  })

  println("fibRecursion")
  println(time {
    f1.fibRecursion(10)
  })

  val points = Seq(Point("1", "0"), Point("2", "1"), Point("3", "1"), Point("4", "2"), Point("5", "2"), Point("6", "3"))
  val builder = new BuildTree()
  val res = builder.createTree(points)

  println("\nTree structure")
  println(res)


  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }
}
