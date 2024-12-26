package arrays

/**
 * Greedy. [2,3,1,1,4]
 */
fun canJump(nums: IntArray): Boolean {
    var targetIndex = nums.size - 1
    for (i in nums.size - 2 downTo 0) {
        if (i + nums[i] >= targetIndex) targetIndex = i
    }
    return targetIndex == 0
}