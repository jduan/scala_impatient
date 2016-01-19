object Exercise1 {
    def countdown(n: Int) {
        for (i <- 10 to 0 by -1) {
            println(i)
        }
    }
    def main(args: Array[String]) {
        countdown(10)
    }
}

// vim: set ts=4 sw=4 et:
