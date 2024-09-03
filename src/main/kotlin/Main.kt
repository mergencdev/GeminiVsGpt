fun main(args: Array<String>) {
    print("1. Write the code that draws a diamond with stars on the console in Kotlin.\n\n")
    drawDiamondGemini(5)
    drawDiamondChatGPT(5)

    print("\n2. Implement a Linked List Data Structure\n\n")
    linkedListGemini()
    linkedListChatGPT()
}

// 1. Write the code that draws a diamond with stars on the console in Kotlin.
// Gemini:
fun drawDiamondGemini(size: Int) {
    print("Gemini:\n")

    // Draw the top half
    for (i in 1..size) {
        repeat(size - i) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }

    // Draw the bottom half (excluding the top row)
    for (i in size - 1 downTo 1) {
        repeat(size - i) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }
}

// ChatGPT:
fun drawDiamondChatGPT(rows: Int) {
    print("ChatGPT:\n")

    // Print the upper half of the diamond
    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ")
        }
        for (j in 1..2 * i - 1) {
            print("*")
        }
        println()
    }

    // Print the lower half of the diamond
    for (i in rows - 1 downTo 1) {
        for (j in 1..rows - i) {
            print(" ")
        }
        for (j in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
}

// 2. Implement a Linked List Data Structure
// Gemini:
private fun linkedListGemini() {
    print("Gemini:\n")

    val linkedList = LinkedListGemini<Int>()

    linkedList.insertAtEnd(10)
    linkedList.insertAtBeginning(20)
    linkedList.insertAtEnd(30)

    println("Linked List:")
    linkedList.traverse()

    linkedList.deleteAtBeginning()
    linkedList.deleteAtEnd()

    println("Linked List after deletions:")
    linkedList.traverse()
}

// ChatGPT:
private fun linkedListChatGPT() {
    print("\nChatGPT:\n")

    val list = LinkedListChatGPT()

    // Insert nodes into the list
    list.insert(10)
    list.insert(20)
    list.insert(30)
    list.insert(40)

    // Traverse and print the list
    println("Linked List after insertion:")
    list.traverse()

    // Delete a node from the list
    list.delete(20)
    println("Linked List after deletion of node with data 20:")
    list.traverse()

    // Attempt to delete a node that doesn't exist
    list.delete(50)
    println("Linked List after attempting to delete node with data 50:")
    list.traverse()
}