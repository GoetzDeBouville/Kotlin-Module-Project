abstract class SelectionScreen<T> : Screen<Any?>() {
    abstract fun getItems(): Map<String, T>
    abstract fun onItemSelected(item: T)

    override fun show() {
        while (true) {
            val items = getItems()
            if (items.isEmpty()) {
                println("Записи отсутствуют")
                return
            } else {
                for ((index, item) in items.keys.withIndex()) {
                    println("${index + 1}. $item")
                }
                println("${items.size + 1}. Назад")
                print("Выберите элемент: ")
                val choice = scanner.nextLine().toIntOrNull()
                if (choice == null || choice < 1 || choice > items.size + 1) {
                    println("Неверный выбор. Пожалуйста, попробуйте снова.")
                } else if (choice == items.size + 1) {
                    return
                } else {
                    val item = items.keys.elementAt(choice - 1)
                    onItemSelected(items[item]!!)
                    return
                }
            }
        }
    }
}