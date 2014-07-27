object Exercise1 {
    def signum(i: Int) = {
        if (i > 0) {
            1
        } else if (i < 0) {
            -1
        } else {
            0
        }
    }
    def main(args: Array[String]) {
        println("sign of 1 is " + signum(1))
        println("sign of 0 is " + signum(0))
        println("sign of -1 is " + signum(-1))
    }
}

// vim: set ts=4 sw=4 et:
