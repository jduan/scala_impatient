object Exercise1 {
    def product(str: String): BigInt = {
        if (str.isEmpty) {
            1
        } else{
            str(0).toInt * product(str.drop(1))
        }
    }
    def main(args: Array[String]) {
        println(product("Hello"))
    }
}

// vim: set ts=4 sw=4 et:
