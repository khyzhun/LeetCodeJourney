package matrix

fun rotate(matrix: Array<IntArray>): Unit {
    for (i in matrix.indices) {
        for (j in i + 1 until matrix.size) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
    for (i in matrix.indices) {
        for (j in 0 until matrix.size / 2) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[i][matrix.size - j - 1]
            matrix[i][matrix.size - j - 1] = temp
        }
    }

    matrix.forEach { rows ->
        println(rows.joinToString(","))
    }
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
    )
    /*
     * expected output:
     * 7 4 1
     * 8 5 2
     * 9 6 3
     */
    println(rotate(matrix = matrix))
}