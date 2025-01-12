package hashmap

fun isHappy(n: Int): Boolean {
    val processed = mutableSetOf<Int>()
    var current = n

    while (current != 1) {
        if (processed.contains(current)) return false
        processed.add(current)
        current = current.toString()
            .map { it.digitToInt() * it.digitToInt() }
            .sum()
    }

    return true
}

fun main() {
    println(isHappy(n = 19))
}