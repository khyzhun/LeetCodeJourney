package matrix

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val columns = mutableSetOf<Char>()
    val rows = mutableSetOf<Char>()
    val block = mutableSetOf<Char>()

    // Checking rows
    for (i in board.indices) {
        rows.clear()
        for (j in board[i].indices) {
            if (rows.contains(board[i][j])) return false
            if (board[i][j] != '.') rows.add(board[i][j])
        }
    }

    // Checking columns
    for (j in board[0].indices) {
        columns.clear()
        for (i in board.indices) {
            if (columns.contains(board[i][j])) return false
            if (board[i][j] != '.') columns.add(board[i][j])
        }
    }

    // Checking 3x3 blocks
    for (blockRowStart in 0 until 9 step 3) {
        for (blockColStart in 0 until 9 step 3) {
            block.clear()
            for (i in blockRowStart until blockRowStart + 3) {
                for (j in blockColStart until blockColStart + 3) {
                    if (board[i][j] != '.' && block.contains(board[i][j])) return false
                    if (board[i][j] != '.') block.add(board[i][j])
                }
            }
        }
    }

    return true
}

fun main() {
    val board = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    println(isValidSudoku(board = board))
}