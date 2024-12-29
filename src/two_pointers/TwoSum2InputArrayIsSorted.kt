package two_pointers

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (left < right) {
        val sum = numbers[left] + numbers[right]
        when {
            sum == target -> return intArrayOf(left + 1, right + 1)
            sum < target -> left++
            else -> right--
        }
    }
    throw IllegalArgumentException("No solution found")
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString(", "))
    println(twoSum(intArrayOf(2, 3, 4), 6).joinToString(", "))
    println(twoSum(intArrayOf(-1, 0), -1).joinToString(", "))
}