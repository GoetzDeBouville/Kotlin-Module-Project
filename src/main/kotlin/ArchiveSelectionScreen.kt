class ArchiveSelectionScreen : SelectionScreen<String>() {
    override fun getItems(): Map<String, String> {
        return archives.keys.associateWith { it }
    }

    override fun onItemSelected(item: String) {
        currentArchive = item
        NoteMenu().show()
    }
}