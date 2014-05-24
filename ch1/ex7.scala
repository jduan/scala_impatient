import java.util.Random
import scala.math.BigInt.probablePrime

object Exercise7 {
    def main(args: Array[String]) {
        val Random = new Random()
        println(probablePrime(100, Random))
    }
}

// vim: set ts=4 sw=4 et:
