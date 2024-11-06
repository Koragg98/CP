//https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1

//Given a binary tree, where every node value is a number. 
//Find the sum of all the numbers that are formed from root to leaf paths. 
//The formation of the numbers would be like 10*parent + current (see the examples for more clarification).

//10,20,30,40,60,N,N
//Output: 2630
//Explanation: There are 3 leaves, resulting in leaf path of 1240, 1260, 130 sums to 2630.


class Solution {
    public static int treePathSumHelper(Node root,int val)
    {
        if(root == null) return 0;
        
        val=val*10+root.data;
        if(root.left==null && root.right==null)
            return val;
        else
            return treePathSumHelper(root.left,val)+treePathSumHelper(root.right,val);
    }
    public static int treePathsSum(Node root) {
        // add code here.
        int ans=treePathSumHelper(root,0);
        return ans;
    }
}
