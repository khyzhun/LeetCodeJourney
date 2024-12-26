package arrays

fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
    val result = mutableListOf<String>()
    val line = mutableListOf<String>()
    var length = 0
    var index = 0

    while (index < words.size) {
        if (length + line.size + words[index].length > maxWidth) {
            /**
             * line is full
             */
            val extraSpace = maxWidth - length
            val spaces = extraSpace / maxOf(1, line.size - 1)
            var remainder = extraSpace % maxOf(1, line.size - 1)

            /**
             * line is full with one word
             */
            if (line.size == 1) {
                if (extraSpace > 0) {
                    line[0] += " ".repeat(spaces)
                }
            } else {
                /**
                 * line is full with multiple words
                 */
                for (j in 0 until line.size - 1) {
                    line[j] += " ".repeat(spaces)
                    if (remainder > 0) {
                        line[j] += " "
                        remainder--
                    }
                }
            }

            result.add(line.joinToString(""))
            line.clear()
            length = 0
        } else {
            /**
             * line is not full
             */
            line.add(words[index])
            length += words[index].length
            index += 1
        }
    }

    /**
     * Last line
     */
    val lastLine = line.joinToString(" ")
    val trailSpace = maxWidth - lastLine.length
    result.add(lastLine + " ".repeat(trailSpace))

    /**
     * Result
     */
    return result
}