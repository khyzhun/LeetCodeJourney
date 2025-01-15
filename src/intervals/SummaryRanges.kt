package intervals

fun summaryRanges(nums: IntArray): List<String> {
    var start = nums.getOrElse(0) { 0 }
    var end = start
    val result = mutableListOf<String>()
    for (i in 1..nums.size) {
        val current = nums.getOrNull(i)
        if (current != null && current == end + 1) {
            // no gap way
            end = current
        } else {
            // gap way
            if (start == end) {
                result.add("$start")
            } else {
                result.add("$start->$end")
            }
            if (current != null) {
                start = current
                end = current
            }
        }
    }
    return result
}

fun main() {
    println(summaryRanges(intArrayOf(0,1,2,4,5,7)))
    println(summaryRanges(intArrayOf(0,2,3,4,6,8,9)))
    println(summaryRanges(intArrayOf()))
}