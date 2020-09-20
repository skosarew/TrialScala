import org.scalatest.FunSuite

class FibonacciTest extends FunSuite {
  val fib = new Fibonacci()

  test("testFibCycle") {
    assert(fib.fibCycle(5) == 5)
    assert(fib.fibCycle(30) == 832040)
    assert(fib.fibCycle(100) == BigInt("354224848179261915075"))
  }

  test("testFibRecursion") {
    assert(fib.fibRecursion(5) == 5)
    assert(fib.fibCycle(30) == 832040)
  }

  test("testFibTailRec") {
    assert(fib.fibTailRec(5) == 5)
    assert(fib.fibCycle(30) == 832040)
    assert(fib.fibTailRec(100) == BigInt("354224848179261915075"))
  }

}
