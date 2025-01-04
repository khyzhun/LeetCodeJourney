package matrix

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    var top = 0
    var right = matrix[0].size - 1
    var bottom = matrix.size - 1
    var left = 0
    val result = mutableListOf<Int>()

    while (top <= bottom && left <= right) {
        for (t in left..right) {
            result.add(matrix[top][t])
            println(matrix[top][t])
        }
        top++

        for (r in top..bottom) {
            result.add(matrix[r][right])
            println(matrix[r][right])
        }
        right--

        if (top <= bottom) {
            for (b in right downTo left) {
                result.add(matrix[bottom][b])
                println(matrix[bottom][b])
            }
            bottom--
        }

        if (left <= right) {
            for (l in bottom downTo top) {
                result.add(matrix[l][left])
                println(matrix[l][left])
            }
            left++
        }
    }

    return result
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
    )
    println(spiralOrder(matrix = matrix))
}