

fun reverseWords(text: String): String {
    val answer = mutableListOf<String>()
    var rightIndex = text.length - 1

    while (rightIndex >= 0) {
        if (text[rightIndex] == ' ') {
            rightIndex--
            continue
        }
        if (text[rightIndex] != ' ') {
            var leftIndex = rightIndex
            while (leftIndex >= 0 && text[leftIndex] != ' ') {
                leftIndex--
            }
            answer.add(text.substring(leftIndex + 1, rightIndex + 1))
            rightIndex = leftIndex
        }
        rightIndex--
    }
    return answer.joinToString(" ")
}