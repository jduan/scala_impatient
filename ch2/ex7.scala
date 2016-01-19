object Exercise1 {
    def product(str: String) = {
        var product: BigInt = 1
        str.foreach(product *= _.toInt)
        product
    }
    def main(args: Array[String]) {
        println(product("Hello"))
    }
}

// vim: set ts=4 sw=4 et:
