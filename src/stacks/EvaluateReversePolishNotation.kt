package stacks

import java.util.*

fun evalRPN(tokens: Array<String>): Int {
    val stack = Stack<Int>()

    for (t in tokens) {
        if (t.toIntOrNull() != null) {
            // digit
            stack.push(t.toInt())
        } else {
            // operator
            val right = stack.pop()
            val left = stack.pop()
            val result = when (t) {
                "+" -> left + right
                "-" -> left - right
                "*" -> left * right
                "/" -> left / right
                else -> throw IllegalArgumentException("Unknown operator: $t")
            }
            stack.push(result)
        }
    }

    return stack.pop()
}

fun main() {
    println(evalRPN(arrayOf("2", "1", "+", "3", "*"))) // exp: (2+1)*3)=9

}