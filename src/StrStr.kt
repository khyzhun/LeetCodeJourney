
/**
 * Input: haystack = "hello", needle = "ll"
 * Output: 0
 * Explanation: "ll" occurs at index 2.
 * The first occurrence is at index 2, so we return 2.
 */
fun strStr(haystack: String, needle: String): Int {
    val hl = haystack.length
    val nl = needle.length

    for (i in 0 until hl - nl + 1) {
        val subString = haystack.substring(i..<i + nl)
        if (subString == needle) {
            return i
        }
    }

    return -1
}