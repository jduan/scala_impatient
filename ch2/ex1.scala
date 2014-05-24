object Exercise1 {
    def signum(num: Int) = {
        if (num > 0)
            1
        else if (num < 0)
            -1
        else
            0
    }
    def main(args: Array[String]) {
        println("signum of 1 is " + signum(1))
        println("signum of -1 is " + signum(-1))
        println("signum of 0 is " + signum(0))
    }
}
