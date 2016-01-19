object Exercise1 {
    def product(str: String) = {
        var product: BigInt = 1
        for (ch <- str) {
            product *= ch
        }
        product
    }
    def main(args: Array[String]) {
        println(product("Hello"))
    }
}

// vim: set ts=4 sw=4 et:
