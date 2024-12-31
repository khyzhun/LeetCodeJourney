package two_pointers

fun threeSum(nums: IntArray): List<List<Int>> {
    val result: MutableList<List<Int>> = mutableListOf()
    nums.sort()

    for (i in nums.indices) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        var left = i + 1
        var right = nums.size - 1
        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            when {
                sum == 0 -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--
                    left++
                    right--
                }
                sum > 0 -> right--
                else -> left++
            }
        }
    }

    return result
}

fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
}