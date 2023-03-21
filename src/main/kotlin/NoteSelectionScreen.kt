class NoteSelectionScreen : SelectionScreen<String>() {
    override fun getItems(): Map<String, String> {
        return archives[currentArchive] ?: emptyMap()
    }

    override fun onItemSelected(item: String) {
        NoteViewScreen(item).show()
    }
}