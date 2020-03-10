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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(root == null)
            return null;
        List<TreeNode> result = new ArrayList<TreeNode>();
        Set<Integer> set = new HashSet<Integer>();

        for(int n : to_delete)
            set.add(n);

        if(!set.contains(root.val))
            result.add(root);

        dfs(root, set, result);
        return result;
    }


   public void dfs(TreeNode root, Set<Integer> set, List<TreeNode> list ) {
       if(root == null)
           return;

       dfs(root.left, set, list);
       dfs(root.right, set, list);

       if(root.right != null && set.contains(root.right.val))
            root.right = null;

       if(root.left != null && set.contains(root.left.val))
           root.left = null;

       if(set.contains(root.val)){
           if(root.right != null)
               list.add(root.right);
           if(root.left != null)
               list.add(root.left);
           root = null;
       }

   }

   public void printList(List<TreeNode> tree){
       for(TreeNode n: tree)
           System.out.println(n.val+",");
   }

}
