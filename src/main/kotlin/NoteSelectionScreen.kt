class NoteSelectionScreen : SelectionScreen<Note>() {
    override fun getItems(): Map<String, Note> {
        return archives[currentArchive]?.mapValues { Note(it.key, it.value) } ?: emptyMap()
    }

    override fun onItemSelected(item: Note) {
        NoteViewScreen(item).show()
    }
}