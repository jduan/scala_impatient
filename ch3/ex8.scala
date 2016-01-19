import scala.collection.mutable.ArrayBuffer

object Exercise5 {
    def removeNegatives(a: ArrayBuffer[Int]) = {
        val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
        val indexes2 = indexes.reverse.dropRight(1)
        for (i <- indexes2) {
            a.remove(i)
        }
        a
    }
    def main(args: Array[String]) {
        val a = ArrayBuffer[Int](1, -2, -3, 4, -5)
        println(removeNegatives(a))
    }
}

// vim: set ts=4 sw=4 et:
