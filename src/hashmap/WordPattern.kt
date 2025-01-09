package hashmap

fun wordPattern(pattern: String, s: String): Boolean {
    val letters = pattern.toCharArray()
    val words = s.split(" ")

    if (letters.size != words.size) {
        return false
    }

    val lettersToWords = hashMapOf<Char, String>()
    val wordsToLetters = hashMapOf<String, Char>()

    for (i in words.indices) {
        val letter = letters[i]
        val word = words[i]
        if (lettersToWords.containsKey(letter) && lettersToWords[letter] != word) {
            return false
        }
        if (wordsToLetters.containsKey(word) && wordsToLetters[word] != letter) {
            return false
        }
        lettersToWords[letter] = word
        wordsToLetters[word] = letter
    }

    return true
}


fun main() {
    println(wordPattern(pattern = "abba", s = "dog cat cat dog"))
}