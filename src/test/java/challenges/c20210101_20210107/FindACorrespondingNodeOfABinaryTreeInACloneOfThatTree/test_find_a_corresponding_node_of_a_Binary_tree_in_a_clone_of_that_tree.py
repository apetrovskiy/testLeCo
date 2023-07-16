import pytest
from src.main.java.challenges.c20210101_20210107.FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree.solution3 import (
    Solution,
    TreeNode,
)


test_data = [(TreeNode(1), TreeNode(2), TreeNode(3), TreeNode(4))]


@pytest.mark.skip(reason="TODO: no way of currently testing this")
@pytest.mark.parametrize("original,cloned,target,expected_result", test_data)
def test_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree(
    original: TreeNode, cloned: TreeNode, target: TreeNode, expected_result: TreeNode
):
    assert expected_result == Solution().getTargetCopy(original, cloned, target)
