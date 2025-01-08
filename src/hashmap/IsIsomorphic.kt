package hashmap

fun isIsomorphic(s: String, t: String): Boolean {
    val mapST = hashMapOf<Char, Char>() // s -> t
    val mapTS = hashMapOf<Char, Char>() // t -> s

    for (i in s.indices) {
        val charS = s[i]
        val charT = t[i]

        // if charS is already mapped but not for charT
        if (mapST.containsKey(charS) && mapST[charS] != charT) {
            return false
        }

        // if charT is already mapped but not for charS
        if (mapTS.containsKey(charT) && mapTS[charT] != charS) {
            return false
        }

        // Continue working
        mapST[charS] = charT
        mapTS[charT] = charS
    }

    return true
}

fun main() {
    println(isIsomorphic(s = "egg", t = "add"))
}