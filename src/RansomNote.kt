// map
fun canConstruct1(ransomNote: String, magazine: String): Boolean {
    val m1: MutableMap<Char, Int> = mutableMapOf()
    for (c in ransomNote) {
        m1[c] = m1.getOrDefault(c, 0) + 1
    }
    val m2: MutableMap<Char, Int> = mutableMapOf()
    for (c in magazine) {
        m2[c] = m2.getOrDefault(c, 0) + 1
    }

    m1.forEach { (c, amount) ->
        val k = m2.getOrDefault(c, 0)
        if (amount > k) {
            return false
        }
    }
    return true
}

// list
fun canConstruct2(ransomNote: String, magazine: String): Boolean {
    val frequency1 = IntArray(26)
    for (char in ransomNote) {
        frequency1[char - 'a']++
    }
    val frequency2 = IntArray(26)
    for (char in magazine) {
        frequency2[char - 'a']++
    }
    for (i in 0..<26) {
        if (frequency1[i] > frequency2[i]) {
            return false
        }
    }

    return true
}

fun main() {
    val result1 = canConstruct1(ransomNote = "aa", magazine = "aab")
    val result2 = canConstruct2(ransomNote = "aac", magazine = "aa")
    println(result1)
    println(result2)
}
