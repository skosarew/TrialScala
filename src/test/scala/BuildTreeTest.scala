import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class BuildTreeTest extends FunSuite {
  val points = Seq(Point("2", "1"), Point("3", "1"), Point("1", "0"), Point("5", "2"), Point("4", "2"), Point("6", "0"))
  val builder = new BuildTree()

  test("testCreateTree") {
    val points = Seq(Point("1", "0"), Point("2", "1"), Point("3", "1"), Point("4", "2"), Point("5", "2"), Point("6", "3"))
    assert(builder.createTree(points) == List(Node(Point("1", "0"), ArrayBuffer(Node(Point("2", "1"), ArrayBuffer(Node(Point("4", "2"), ArrayBuffer()), Node(Point("5", "2"), ArrayBuffer()))), Node(Point("3", "1"), ArrayBuffer(Node(Point("6", "3"), ArrayBuffer())))))))

    val points2 = Seq(Point("1", "0"), Point("2", "1"), Point("3", "1"), Point("4", "0"), Point("5", "4"), Point("6", "4"))
    assert(builder.createTree(points2) == List(Node(Point("1", "0"), ArrayBuffer(Node(Point("2", "1"), ArrayBuffer()), Node(Point("3", "1"), ArrayBuffer()))), Node(Point("4", "0"), ArrayBuffer(Node(Point("5", "4"), ArrayBuffer()), Node(Point("6", "4"), ArrayBuffer())))))

    val points3 = Seq.empty
    assert(builder.createTree(points3) == List())
  }

}
