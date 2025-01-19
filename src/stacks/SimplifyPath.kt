package stacks

import java.util.Stack

fun simplifyPath(path: String): String {
    val stack: Stack<String> = Stack<String>()
    val split = path.split("/")

    for (current in split) {
        when (current) {
            ".", "" -> continue
            ".." -> if (stack.isNotEmpty()) stack.pop()
            else -> stack.push(current)
        }
    }

    return "/" + stack.joinToString("/")
}

fun main() {
//    println(simplifyPath("/home/")) // exp: /home
//    println(simplifyPath("/home//foo")) // exp: /home/foo
//    println(simplifyPath("/home/user/Documents/../Pictures")) // exp: /home/user/Pictures
//    println(simplifyPath("/../")) // exp: /
    println(simplifyPath("/.../a/../b/c/../d/./")) // exp: /.../b/d
}