package intervals

import kotlin.math.max
import kotlin.math.min

fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    var i = 0

    // intervals before overlapping
    while (i < intervals.size && intervals[i][1] < newInterval[0]) {
        result.add(intervals[i])
        i++
    }

    // overlapping intervals
    val merged = newInterval
    while (i < intervals.size && intervals[i][0] <= merged[1]) {
        merged[0] = min(merged[0], intervals[i][0])
        merged[1] = max(merged[1], intervals[i][1])
        i++
    }
    result.add(merged)

    // intervals after overlapping
    while (i < intervals.size) {
        result.add(intervals[i])
        i++
    }

    return result.toTypedArray()
}

fun main() {
    val result = insert(
        intervals = arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)),
        newInterval = intArrayOf(2,5)
    )
    for (ints in result) {
        println(ints.joinToString(", "))
    }
}