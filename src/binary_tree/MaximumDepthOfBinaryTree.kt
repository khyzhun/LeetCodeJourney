package binary_tree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val leftDepth = maxDepth(root.left)
    val rightDepth = maxDepth(root.right)
    return maxOf(leftDepth, rightDepth) + 1
}

fun main() {
    println(maxDepth(root = TreeNode(3)))
}