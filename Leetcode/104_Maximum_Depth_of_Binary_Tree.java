//Here, the max depth or height of the binary tree is calculated using the concept of recursion

class Solution {
    public int maxDepth(TreeNode root) {
          
        if(root == null){
            return 0;
        }
        else{
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;         //recursive calls : each node will be acting like a root node in this case
        }
        
    }
}
