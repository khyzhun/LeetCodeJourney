package hashmap

import kotlin.math.abs

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val locators = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val curr = nums[i]
        if (locators.containsKey(curr)) {
            val dPos = locators.getOrDefault(curr, 0)
            if (abs(i-dPos) <= k) {
                return true
            }
        }
        locators[curr] = i
    }
    return false
}

fun main() {
    println(containsNearbyDuplicate(nums = intArrayOf(1,2,3,1), k = 3))
}