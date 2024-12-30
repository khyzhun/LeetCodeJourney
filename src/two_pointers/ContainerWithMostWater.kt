package two_pointers

import kotlin.math.min

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var max = 0

    while (left < right) {
        val area = min(height[left], height[right]) * (right - left)
        max = maxOf(max, area)

        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }

    return max
}

fun main() {
    println(maxArea(height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}