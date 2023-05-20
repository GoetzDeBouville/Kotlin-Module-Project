class ArchiveCreationScreen : Screen<Any?>() {
    override fun show() {
        while (true) {
            print("Введите название нового архива: ")
            val name = scanner.nextLine()
            if (name.isEmpty()) {
                println("Название архива не может быть пустым.")
            } else if (archives.containsKey(name)) {
                println("Архив с таким именем уже существует.")
            } else {
                archives[name] = mutableMapOf()
                currentArchive = name
                NoteMenu().show()
                break
            }
        }
    }
}