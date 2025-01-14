package hashmap

fun longestConsecutive(nums: IntArray): Int {
    val dataSet = nums.toHashSet()
    var maxLength = 0
    for (curr in dataSet) {
        // getting the smallest one item
        if (!dataSet.contains(curr - 1)) {
            var currentNum = curr
            var length = 1
            // updating the size of the longest consecutive for current item
            while (dataSet.contains(currentNum + 1)) {
                currentNum++
                length++
            }
            // getting longest consecutive
            maxLength = maxOf(maxLength, length)
        }
    }
    return maxLength
}

fun main() {
    println(longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2)))
}