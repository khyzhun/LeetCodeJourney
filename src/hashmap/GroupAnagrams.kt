package hashmap

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val groups = mutableMapOf<List<Int>, MutableList<String>>()
    for (word in strs) {
        val signature = IntArray(26)
        for (char in word.toCharArray()) {
            signature[char - 'a']++
        }
        val key = signature.toList()
        groups.computeIfAbsent(key) { mutableListOf() }.add(word)
    }

    return groups.values.map { it }
}

fun main() {
    println(groupAnagrams(strs = arrayOf("eat","tea","tan","ate","nat","bat")))
}