object Exercise3 {
    def swapAdjacent(a: Array[Int]) = {
        for (i <- 0 until a.length)
            yield if (i % 2 == 0) {
                if (i == a.length - 1) {
                    a(i)
                } else {
                    a(i + 1)
                }
                } else {
                    a(i - 1)
            }
    }
    def printArray(a: IndexedSeq[Int]) {
        println()
        for (i <- 0 until a.length) {
            printf("a(%d) is %d\n", i, a(i))
        }
        println()
    }
    def main(args: Array[String]) {
        val a = Array(1, 2, 3, 4, 5)
        printArray(a)
        printArray(swapAdjacent(a))
        val b = Array(1, 2, 3, 4, 5, 6)
        printArray(b)
        printArray(swapAdjacent(b))
        val c = Array(2)
        printArray(c)
        printArray(swapAdjacent(c))
        val d = Array(1, 2)
        printArray(d)
        printArray(swapAdjacent(d))
        val e = Array(1, 2, 3)
        printArray(e)
        printArray(swapAdjacent(e))
    }
}

// vim: set ts=4 sw=4 et:
