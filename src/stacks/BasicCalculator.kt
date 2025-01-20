package stacks

import java.util.*

fun calculate(s: String): Int {
    val stack = Stack<Int>()
    var result = 0 // total
    var sign = 1 // + or - for current number
    var number = 0 // current number we work with
    for (token in s) {
        when (token) {
            '+' -> {
                result += sign * number
                sign = 1
                number = 0
            }
            '-' -> {
                result += sign * number
                sign = -1
                number = 0
            }
            '(' -> {
                stack.push(result)
                stack.push(sign)
                result = 0
                sign = 1
            }
            ')' -> {
                result += sign * number
                result *= stack.pop()
                result += stack.pop()
                number = 0
            }
            ' ' -> continue
            else -> {
                number = number * 10 + (token - '0')
            }
        }
    }
    result += sign * number
    return result
}

fun main() {
//    println(calculate("1 + 1")) // 2
//    println(calculate(" 2-1 + 2 ")) // 3
    println(calculate("(1+(4+5+2)-3)+(6+8)")) // 23
}