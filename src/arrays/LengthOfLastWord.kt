package arrays
fun lengthOfLastWord(s: String): Int {
    for (i in s.length - 1 downTo 0) {
        if (s[i] != ' ') {
            var j = i
            while (j >= 0 && s[j] != ' ') {
                j--
            }
            return i - j
        }
    }
    return 0
}