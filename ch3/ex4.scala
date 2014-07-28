import scala.collection.mutable.ArrayBuffer

object Exercise4 {
    def reorderArray(a: Array[Int]) = {
        val ab = new ArrayBuffer[Int]()
        for (e <- a if e > 0) {
            ab.append(e)
        }
        for (e <- a if e <= 0) {
            ab.append(e)
        }
        ab.toArray
    }
    def printArray(a: IndexedSeq[Int]) {
        println()
        for (i <- 0 until a.length) {
            printf("a(%d) is %d\n", i, a(i))
        }
        println()
    }
    def main(args: Array[String]) {
        val a = Array(1, -2, -3, 4, -5)
        printArray(a)
        printArray(reorderArray(a))
    }
}

// vim: set ts=4 sw=4 et:
