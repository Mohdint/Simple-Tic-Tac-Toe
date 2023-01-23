package tictactoe
fun main() {
    // Get the initial 3x3 grid from input
    print("Enter cells: ")
    val input = readln()
    val r = input.toMutableList()
    // Output the initial grid
    printGrid(r)
    // Prompt user for move
    print("Enter the coordinates of your move (e.g. 1 1): ")
    // Keep prompting until valid input is received
    var move: List<Int>
    do {
        move = readln().split(" ").map { it.toInt() }
        if (move.size != 2) {
            println("You should enter 2 numbers!")
        } else if (move[0] !in 1..3 || move[1] !in 1..3) {
            println("Coordinates should be from 1 to 3!")
        } else if (r[(move[0] - 1) * 3 + move[1] - 1] != '_') {
            println("This cell is occupied! Choose another one!")
        }
    } while (move.size != 2 || move[0] !in 1..3 || move[1] !in 1..3 || r[(move[0] - 1) * 3 + move[1] - 1] != '_')
    // Update the grid with the user's move
    r[(move[0] - 1) * 3 + move[1] - 1] = 'X'
    // Output the updated grid
    printGrid(r)
}
fun printGrid(r: MutableList<Char>) {
    println(
            """
        ---------
        | ${r[0]} ${r[1]} ${r[2]} |
        | ${r[3]} ${r[4]} ${r[5]} |
        | ${r[6]} ${r[7]} ${r[8]} |
        ---------
    """.trimIndent()
    )
}