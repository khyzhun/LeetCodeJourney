package two_pointers

fun isPalindrome(s: String): Boolean {
    val cleaned = s.lowercase().filter { it.isLetterOrDigit() }

    var left = 0
    var right = cleaned.length - 1

    while (left <= right) {
        if (cleaned[left] != cleaned[right]) {
            return false
        }
        left++
        right--
    }
    return true
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama")) // true
    println(isPalindrome("race a car")) // false
    println(isPalindrome(" ")) // true
}