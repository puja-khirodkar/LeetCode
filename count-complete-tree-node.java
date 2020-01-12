/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        
        int leftHeight=getLeftHeight(root);
        int rightHeight=getRightHeight(root); 
        
        if(leftHeight==rightHeight)
            return (1<<leftHeight)-1;
        
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    
    public int getLeftHeight(TreeNode root){
        int count=0;
         while(root!=null){
            root=root.left;
            count++;

        }
        return count;
    }
    
    public int getRightHeight(TreeNode root){
        int count=0;
        while(root!=null){
            root=root.right;
            count++;
        }
        return count;
    }
 
}
