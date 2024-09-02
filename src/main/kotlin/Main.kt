fun main(args: Array<String>) {
    print("1. Write the code that draws a diamond with stars on the console in Kotlin.\n\n")
    drawDiamondGemini(5)
    drawDiamondChatGPT(5)
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