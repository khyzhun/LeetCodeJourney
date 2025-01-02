package sliding_window

fun lengthOfLongestSubstring(s: String): Int {
    var l = 0
    var maxLength = 0
    val window = mutableSetOf<Char>()
    for (r in s.indices) {
        while (window.contains(s[r])) {
            window.remove(s[l])
            l++
        }
        window.add(s[r])
        maxLength = maxOf(maxLength, r - l + 1)
    }
    return maxLength
}

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}