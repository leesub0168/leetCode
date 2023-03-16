/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return (root.val == targetSum);
        List<Integer> list = new ArrayList<>();
        if(root.left != null) {
            bfs(root.left, root.val, list);
        }
        if(root.right != null) {
            bfs(root.right, root.val, list);
        }
        
        return list.contains(targetSum);
    }
    
    public void bfs(TreeNode node, int sum, List<Integer> list) {
        sum += node.val;
        if(node.left == null && node.right == null) {
            list.add(sum);
            return;
        }
        if(node.left == null && node.right != null) {
            bfs(node.right, sum, list);
            return;
        }
        if(node.left != null && node.right == null) {
            bfs(node.left, sum, list);
            return;
        }
        bfs(node.left, sum, list);
        bfs(node.right, sum, list);
    }
}