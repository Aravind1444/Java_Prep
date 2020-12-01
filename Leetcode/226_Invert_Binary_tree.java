class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return root;
        }
        
        TreeNode left = invertTree(root.left);          //assign the left section to "left"
        TreeNode right = invertTree(root.right);        //assign the right section to "right"
        
        root.right = left;                              //swap left to right
        root.left = right;                              //swap righ to left
        
        return root;
    }
}
