import scala.annotation.tailrec

class Fibonacci() {
  def fibCycle(n: BigInt): BigInt = {
    var a: BigInt = 0
    var b: BigInt = 1
    var i = 2
    var fibSum: BigInt = 0

    while (i < n + 1) {
      fibSum = a + b
      a = b
      b = fibSum
      i += 1
    }
    b
  }

  def fibRecursion(n: Long): Long = {
    if (n < 2) n
    else fibRecursion(n - 1) + fibRecursion(n - 2)
  }

  def fibTailRec(n: BigInt): BigInt = {
    @tailrec
    def fibTailInside(n: BigInt, a: BigInt, b: BigInt): BigInt = {
      if (n == 0) return b
      fibTailInside(n - 1, b, a + b)
    }

    fibTailInside(n - 1, 0, 1)
  }
}
