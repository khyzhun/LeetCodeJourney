package binary_tree

fun sumNumbers(root: TreeNode?): Int {
    root ?: return 0
    return calculateSumNumbers(root, 0)
}

private fun calculateSumNumbers(root: TreeNode?, sum: Int): Int {
    return when {
        root == null -> 0
        root.left == null && root.right == null -> sum * 10 + root.`val`
        else -> calculateSumNumbers(root.left, sum * 10 + root.`val`) +
                calculateSumNumbers(root.right, sum * 10 + root.`val`)
    }
}