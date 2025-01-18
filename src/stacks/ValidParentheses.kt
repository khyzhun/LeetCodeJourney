package stacks

import java.util.Stack

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    val pairs = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )
    for (char in s) {
        if (char in pairs.values) {
            stack.push(char)
        } else if (stack.isNotEmpty() && stack.peek() == pairs[char]) {
            stack.pop()
        } else {
            return false
        }
    }
    return stack.isEmpty()
}

fun main() {
    println(isValid("()[]{}"))
}