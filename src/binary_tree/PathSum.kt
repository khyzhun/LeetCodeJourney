package binary_tree

// https://leetcode.com/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150
// [5,4,8,11,null,13,4,7,2,null,null,null,1]
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    return when {
        root == null -> false
        root.left == null && root.right == null && root.`val` == targetSum -> true
        else -> hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}