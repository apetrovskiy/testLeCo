package challenges.c20210101to20210107.FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree;

// Definition for a binary tree node.
@SuppressWarnings("PMD")
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public final TreeNode getTargetCopy(
            final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return new TreeNode(1);
    }
}
