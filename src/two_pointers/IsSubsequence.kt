package two_pointers

fun isSubsequence(s: String, t: String): Boolean {
    var first = 0
    var last = 0

    while (first < s.length && last < t.length) {
        if (s[first] == t[last]) {
            first++
        }
        last++
    }

    return first == s.length
}

fun main() {
    println(isSubsequence("abc", "ahbgdc"))
}