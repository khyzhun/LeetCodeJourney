package binary_tree

//https://leetcode.com/problems/count-complete-tree-nodes/description/?envType=study-plan-v2&envId=top-interview-150

fun countNodes(root: TreeNode?): Int {
    if (root == null) return 0
    return countNodes(root.left) - countNodes(root.right) + 1
}

fun countNodes2(root: TreeNode?): Int {
    if (root == null) return 0

    fun getHeight(node: TreeNode?): Int {
        var height = 0
        var current = node
        while (current != null) {
            height++
            current = current.left
        }
        return height
    }

    val leftHeight = getHeight(root.left)
    val rightHeight = getHeight(root.right)

    return if (leftHeight == rightHeight) {
        // Left subtree is full. 1 shl leftHeight is equals to 2^height.
        (1 shl leftHeight) + countNodes(root.right)
    } else {
        // Right subtree is full. 1 shl rightHeight is equals to 2^height.
        (1 shl rightHeight) + countNodes(root.left)
    }
}