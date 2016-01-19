object Exercise1 {
    def createArray(n: Int) = {
        val a = new Array[Int](n)
        for (i <- 0 until a.length) {
            a(i) = scala.util.Random.nextInt(10)
        }
        a
    }
    def main(args: Array[String]) {
        val a = createArray(10)
        for (e <- a) {
            println("element " + e)
        }
    }
}

// vim: set ts=4 sw=4 et:
