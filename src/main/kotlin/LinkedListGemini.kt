class LinkedListGemini<T> {
    private var head: NodeGemini<T>? = null

    private fun isEmpty(): Boolean {
        return head == null
    }

    fun insertAtBeginning(data: T) {
        val newNodeGemini = NodeGemini(data)
        newNodeGemini.next = head
        head = newNodeGemini
    }

    fun insertAtEnd(data: T) {
        if (isEmpty()) {
            insertAtBeginning(data)
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = NodeGemini(data)
        }
    }

    fun deleteAtBeginning() {
        if (!isEmpty()) {
            head = head?.next
        }
    }

    fun deleteAtEnd() {
        if (!isEmpty()) {
            if (head?.next == null) {
                head = null
            } else {
                var current = head
                while (current?.next?.next != null) {
                    current = current.next
                }
                current?.next = null
            }
        }
    }

    fun traverse() {
        var current = head
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
        println()
    }
}