import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object Exercise9 {
    def main(args: Array[String]) {
        val flavors =
            SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
        val fl: Buffer[String] =
            flavors.getNativesForFlavor(DataFlavor.imageFlavor)
        println(fl)
    }
}

// vim: set ts=4 sw=4 et:
