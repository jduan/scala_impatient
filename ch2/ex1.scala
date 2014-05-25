object Exercise1 {
    def signum(num: Int) = {
        if (num > 0)
            1
        else if (num < 0)
            -1
        else
            0
    }
    def countdown(n: Int) {
        if (n >= 0) {
            println(n)
            countdown(n - 1)
        }
    }

    def product(s: String): BigInt = {
        if (s.isEmpty) {
            1
        } else {
            s(0) * product(s.substring(1))
        }
    }
    def exp(x: Int, n: Int): BigInt = {
        if (n < 0) {
            exp(x, 0 - n)
        } else {
            if (n == 0) {
                1
            } else if (n % 2 == 0) {
                val y = exp(x, n / 2)
                y * y
            } else {
                x * exp(x, n - 1)
            }
        }
    }
    def main(args: Array[String]) {
        println("signum of 1 is " + signum(1))
        println("signum of -1 is " + signum(-1))
        println("signum of 0 is " + signum(0))
        countdown(10)
        println("product of Hello is " + product("Hello"))
        println("3 to 0 is " + exp(3, 0))
        println("3 to 1 is " + exp(3, 1))
        println("3 to 2 is " + exp(3, 2))
        println("3 to 3 is " + exp(3, 3))
    }
}
