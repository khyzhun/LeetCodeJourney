package binary_tree

fun isSymmetric(root: TreeNode?): Boolean {
    root ?: return false
    var value = root.`val`
    return isMirror(root.left, root.right)
}

fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
    return when {
        left == null && right == null -> true
        left == null || right == null -> false
        else -> left.`val` == right.`val` && isMirror(left.left, right.right) && isMirror(left.right, right.left)
    }
}