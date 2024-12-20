fun hIndex(citations: IntArray): Int {
    val sorted = citations.sorted()
    var result = -1
    for (i in sorted.indices) {
        if (sorted[i] >= sorted.size - i) {
            result = sorted.size - i
            break
        }
    }
    return result
}


fun main() {
    val example = intArrayOf(3,0,6,1,5)
    val result = hIndex(example)
    println(result)
}