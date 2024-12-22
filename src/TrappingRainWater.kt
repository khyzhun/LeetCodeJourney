import kotlin.math.max
import kotlin.math.min

fun trap(height: IntArray): Int {
    val leftMax = IntArray(height.size)
    val rightMax = IntArray(height.size)

    for (i in 0 until height.size) {
        leftMax[i] = if (i == 0) {
            height[i]
        } else {
            max(leftMax[i - 1], height[i])
        }
    }

    for (i in height.size - 1 downTo  0) {
        rightMax[i] = if (i == height.size - 1) {
            height[height.size - 1]
        } else {
            max(rightMax[i + 1], height[i])
        }
    }

    var water = 0
    for (i in 0 until height.size) {
        water += (min(leftMax[i], rightMax[i]) - height[i]).coerceAtLeast(0)
    }

    return water
}


fun main() {
    val result = trap(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1))
    println(result)
}

