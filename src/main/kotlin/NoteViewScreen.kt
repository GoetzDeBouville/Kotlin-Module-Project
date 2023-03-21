class NoteViewScreen(private val note: Note) : Screen<Any?>() {
    override fun show() {
        println(note.content)

        while (true) {
            println("0. Удалить\n1. Назад")
            print("Выберите пункт меню: ")
            when (scanner.nextLine().toIntOrNull()) {
                0 -> {
                    currentArchive?.let { archives[it]?.remove(note.key) }
                    println("Заметка удалена")
                    return
                }
                1 -> return
                else -> println("Неверный выбор. Пожалуйста, попробуйте снова.")
            }
        }
    }
}