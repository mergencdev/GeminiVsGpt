class LinkedListChatGPT {

    private var head: NodeChatGPT? = null

    // Node class representing each element in the linked list
    data class NodeChatGPT(var data: Int, var next: NodeChatGPT? = null)

    // Function to insert a new node at the end of the list
    fun insert(data: Int) {
        val newNodeChatGPT = NodeChatGPT(data)
        if (head == null) {
            head = newNodeChatGPT
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNodeChatGPT
        }
    }

    // Function to delete a node with the specified data
    fun delete(data: Int) {
        if (head == null) {
            println("List is empty")
            return
        }

        // If the node to be deleted is the head
        if (head?.data == data) {
            head = head?.next
            return
        }

        var current = head
        var previous: NodeChatGPT? = null

        while (current != null && current.data != data) {
            previous = current
            current = current.next
        }

        if (current == null) {
            println("Node with data $data not found")
            return
        }

        previous?.next = current.next
    }

    // Function to display all the nodes in the list
    fun traverse() {
        if (head == null) {
            println("List is empty")
            return
        }

        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }
}