package binary_tree

// [2,1,3] -> [3,1,2]
fun invertTree(root: TreeNode?): TreeNode? {
    root ?: return null
    root.left = invertTree(root.right).also {
        root.right = invertTree(root.left)
    }
    return root
}