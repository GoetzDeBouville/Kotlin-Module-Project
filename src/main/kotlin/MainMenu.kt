import kotlin.system.exitProcess

class MainMenu : Screen<Any?>() {
    override fun show() {
        while (true) {
            println("Меню:\n1. Список архивов\n2. Создать архив\n3. Выйти\n")
            print("Выберите пункт меню: ")
            when (scanner.nextLine().toIntOrNull()) {
                1 -> ArchiveSelectionScreen().show()
                2 -> ArchiveCreationScreen().show()
                3 -> exitProcess(0)
                else -> println("Неверный выбор. Пожалуйста, попробуйте снова.")
            }
        }
    }
}