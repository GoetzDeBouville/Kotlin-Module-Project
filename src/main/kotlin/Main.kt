import java.util.*

val scanner = Scanner(System.`in`)
val archives = mutableMapOf<String, MutableMap<String, String>>()
var currentArchive: String? = null

fun main() {
    val mainMenu = MainMenu()
    mainMenu.show()
}