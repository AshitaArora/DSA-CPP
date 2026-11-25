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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
       return check(root,k);
    }
    public int check(TreeNode root,int k){
        if(root==null)return -1;
        int left=check(root.left,k);
        count++;
         if(count==k)return root.val;
        if(left!=-1)return left;
        return check(root.right,k);
    }
}