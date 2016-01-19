import scala.collection.mutable.ArrayBuffer

object Exercise5 {
    def average(a: Array[Double]) = {
        a.sum / a.length
    }
    def main(args: Array[String]) {
        val a = Array[Double](1, -2, -3, 4, -5)
        println(average(a))
    }
}

// vim: set ts=4 sw=4 et:
