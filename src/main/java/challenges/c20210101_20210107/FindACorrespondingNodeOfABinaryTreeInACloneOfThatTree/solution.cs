namespace challenges.c20210101_20210107.FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree
{
    // Definition for a binary tree node.
    public class TreeNode
    {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }


    public class Solution
    {
        public TreeNode GetTargetCopy(TreeNode original, TreeNode cloned, TreeNode target)
        {
            return new TreeNode(1);
        }
    }
}