fun main() {
    val rows = 6

    for (i in 1..rows) {
        repeat(i) {
            print("*")
        }
        repeat(rows + 2 - i) {
            print(" ")
        }
        repeat(rows - i) {
            print(" ")
        }
        repeat(i) {
            print("* ")
        }
        println()
    }
}