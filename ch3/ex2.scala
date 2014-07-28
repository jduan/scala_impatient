object Exercise2 {
    def swapAdjacent(a: Array[Int]) = {
        for (i <- 0 until a.length - 1 by 2) {
            val tmp = a(i)
            a(i) = a(i + 1)
            a(i + 1) = tmp
        }
    }
    def printArray(a: Array[Int]) {
        for (i <- 0 until a.length) {
            printf("a(%d) is %d\n", i, a(i))
        }
    }
    def main(args: Array[String]) {
        val a = Array(1, 2, 3, 4, 5)
        printArray(a)
        swapAdjacent(a)
        printArray(a)
        val b = Array(1, 2, 3, 4, 5, 6)
        printArray(b)
        swapAdjacent(b)
        printArray(b)
        val c = Array(2)
        printArray(c)
        swapAdjacent(c)
        printArray(c)
    }
}

// vim: set ts=4 sw=4 et:
