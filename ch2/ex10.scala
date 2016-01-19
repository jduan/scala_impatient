object Exercise1 {
    def toTheN(x: Int, n: Int): BigDecimal = {
        if (n > 0 && n % 2 == 0) {
            val y = toTheN(x, n / 2)
            y * y
        } else if (n > 0 && n % 2 == 1) {
            x * toTheN(x, n - 1)
        } else if (n < 0) {
            1 / toTheN(x, -n)
        } else {
            1
        }
    }
    def main(args: Array[String]) {
        println(toTheN(2, 10))
        println(toTheN(2, -10))
        println(toTheN(2, 9))
        println(toTheN(2, -9))
        println(toTheN(2, 0))
    }
}

// vim: set ts=4 sw=4 et:
