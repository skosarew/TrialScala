import scala.collection.mutable

class BuildTree {
  def createTree(points: Seq[Point]): Seq[Node] = {
    val lookup = new mutable.LinkedHashMap[String, Node]
    points.foreach(x => lookup.put(x.id, Node(x, mutable.Buffer())))

    for (item <- lookup.values) {
      if (lookup.contains(item.point.parentId)) {
        lookup(item.point.parentId).children.append(Node(item.point, item.children))
      }
    }

    lookup.values.filter((x: Node) => x.point.parentId == "0").toSeq
  }

}

case class Point(var id: String, var parentId: String)

case class Node(point: Point, var children: mutable.Buffer[Node])