class NoteViewScreen(private val note: String) : Screen<Any?>() {
    override fun show() {
        println(note)
        println(archives[currentArchive]?.get(note) ?: "Текст заметки отсутствует")

        while (true) {
            println("0. Удалить\n1. Назад")
            print("Выберите пункт меню: ")
            when (scanner.nextLine().toIntOrNull()) {
                0 -> {
                    archives[currentArchive]?.remove(note)
                    return
                }
                1 -> return
                else -> println("Неверный выбор. Пожалуйста, попробуйте снова.")
            }
        }
    }
}