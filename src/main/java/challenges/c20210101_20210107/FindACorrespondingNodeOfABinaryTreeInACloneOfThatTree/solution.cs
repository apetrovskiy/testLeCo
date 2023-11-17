// <copyright file="solution.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Challenges.C20210101_20210107.FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree
{
    // Definition for a binary tree node.
    public class TreeNode
    {
        public int Val;
        public TreeNode Left;
        public TreeNode Right;

        public TreeNode(int x)
        {
            this.Val = x;
        }
    }

    public class Solution
    {
        public TreeNode GetTargetCopy(TreeNode original, TreeNode cloned, TreeNode target)
        {
            return new TreeNode(1);
        }
    }
}