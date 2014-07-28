import scala.collection.mutable.ArrayBuffer

object Exercise9 {
    def findUSTimeZones() = {
        val americaTimeZones = for (tz <- java.util.TimeZone.getAvailableIDs if tz.startsWith("America")) yield tz.substring(8)
        americaTimeZones.sorted
    }
    def main(args: Array[String]) {
        for (tz <- findUSTimeZones()) {
            println(tz)
        }
    }
}

// vim: set ts=4 sw=4 et:
