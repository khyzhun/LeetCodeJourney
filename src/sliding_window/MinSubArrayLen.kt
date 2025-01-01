package sliding_window

import kotlin.math.min

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var start = 0
    var sum = 0
    var res = Int.MAX_VALUE

    for (end in nums.indices) {
        sum += nums[end]

        while (sum >= target) {
            res = min(res, end - start + 1)
            sum -= nums[start]
            start++
        }
    }


    return if (res == Int.MAX_VALUE) 0 else res
}

fun main() {
    println(minSubArrayLen(target = 7, nums = intArrayOf(2, 3, 1, 2, 4, 3)))
}