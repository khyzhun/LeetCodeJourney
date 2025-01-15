package intervals

import kotlin.math.max

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }
    val results = mutableListOf<IntArray>()
    var start = intervals[0][0]
    var end = intervals[0][1]

    for (i in 1 until intervals.size) {
        val current = intervals[i]
        // if our intervals overlaps we need to merge them
        if (current[0] <= end) {
            end = max(end, current[1])
        } else {
            // otherwise we simply add finished interval to the result
            results.add(intArrayOf(start, end))
            start = current[0]
            end = current[1]
        }
    }

    // adding last iteration after the for-loop is done
    results.add(intArrayOf(start, end))
    return results.toTypedArray()
}

fun main() {
    val result = merge(intervals = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18)
    ))
    for (ints in result) {
        println(ints.joinToString(", "))
    }
}