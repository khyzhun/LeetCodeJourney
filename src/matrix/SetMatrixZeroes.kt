package matrix

fun setZeroes(matrix: Array<IntArray>): Unit {
    var firstRowHasZero = false
    var firstColHasZero = false

    println("step 1: input matrix:")
    matrix.forEach { rows -> println(rows.joinToString(", ")) }
    println()

    // checking zeros in first column
    for (i in matrix.indices) {
        if (matrix[i][0] == 0) firstColHasZero = true
    }
    // checking zeros in first row
    for (j in matrix[0].indices) {
        if (matrix[0][j] == 0) firstRowHasZero = true
    }

    // making first column and row with zeros if needed
    for (i in 1 until matrix.size) {
        for (j in 1 until matrix[0].size) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }

    println("step 2: making first column and row with zeros if needed:")
    matrix.forEach { rows -> println(rows.joinToString(", ")) }
    println()

    // making zeros for rows and columns
    for (i in 1 until matrix.size) {
        for (j in 1 until matrix[0].size) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0
            }
        }
    }

    println("step 3: making all columns and rows with zeros if needed:")
    matrix.forEach { rows -> println(rows.joinToString(", ")) }
    println()

    // updating first row after all operations
    if (firstRowHasZero) {
        for (j in matrix[0].indices) {
            matrix[0][j] = 0
        }
    }

    println("step 4: updating first row if it has zero:")
    matrix.forEach { rows -> println(rows.joinToString(", ")) }
    println()

    // updating first column after all operations
    if (firstColHasZero) {
        for (i in matrix.indices) {
            matrix[i][0] = 0
        }
    }

    println("step 5: updating first column if it has zero:")
    matrix.forEach { rows -> println(rows.joinToString(", ")) }
    println()

    println("***** result *****")
    matrix.forEach { rows -> println(rows.joinToString(", ")) }
    println()

}

fun main() {
    val matrix = arrayOf(
        intArrayOf(0, 1, 1, 1),
        intArrayOf(1, 1, 1, 1),
        intArrayOf(1, 1, 0, 1),
        intArrayOf(1, 1, 1, 1),
    )
    println(setZeroes(matrix = matrix))
}