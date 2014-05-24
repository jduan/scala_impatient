object Exercise9 {
    def main(args: Array[String]) {
        val s = "hello"
        println("first character " + s(0))
        println("first character " + s.take(1))
        println("last character " + s.takeRight(1))
    }
}

// vim: set ts=4 sw=4 et:
