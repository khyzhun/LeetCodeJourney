package hashmap

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val first = hashMapOf<Char, Int>()
    for (i in 0 until s.length) {
        val item = s[i]
        first[item] = first.getOrDefault(item, 0) + 1
    }

    val second = hashMapOf<Char, Int>()
    for (j in 0 until t.length) {
        val item = t[j]
        //if (!first.containsKey(t[j])) { return false }
        second[item] = second.getOrDefault(item, 0) + 1
    }

    return first == second
}

fun main() {
    println(isAnagram(s = "anagram", t = "nagaram"))
}