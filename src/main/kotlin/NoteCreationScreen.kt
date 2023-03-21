import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class NoteCreationScreen : Screen<Any?>() {
    override fun show() {
        while (true) {
            print("Введите название новой заметки: ")
            val noteName = scanner.nextLine()
            if (noteName.isEmpty()) {
                println("Название заметки не может быть пустым.")
            } else {
                print("Введите текст новой заметки: ")
                val noteText = scanner.nextLine()
                val noteFullName = "$noteName ${LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"))}"
                archives[currentArchive]?.put(noteFullName, noteText)
                break
            }
        }
    }
}