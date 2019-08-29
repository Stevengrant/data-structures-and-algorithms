package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumBinaryTreeTest {
    @Test
    public void test_findMax(){
        FindMaximumBinaryTree test = new FindMaximumBinaryTree();
        TreeNode rootVal =
                new TreeNode(
                        new TreeNode(
                                new TreeNode(
                                        null,
                                        null,
                                        5
                                ),
                                new TreeNode(
                                        null,
                                        null,
                                        56
                                ),
                                2
                        ),
                        new TreeNode(
                                null,
                                null,
                                5
                        ),
                        1
        );
        assertEquals("should return the biggest value",test.findMaximumValue(rootVal),56 );
        rootVal =
                new TreeNode(
                        new TreeNode(
                                new TreeNode(
                                        null,
                                        null,
                                        -99
                                ),
                                new TreeNode(
                                        null,
                                        null,
                                        -1000
                                ),
                                -2
                        ),
                        new TreeNode(
                                null,
                                null,
                                -1
                        ),
                        -30
                );
        assertEquals("should return the biggest value",test.findMaximumValue(rootVal),-1 );
        rootVal =
                new TreeNode(
                        new TreeNode(
                                new TreeNode(
                                        null,
                                        null,
                                        0
                                ),
                                new TreeNode(
                                        null,
                                        null,
                                        0
                                ),
                                0
                        ),
                        new TreeNode(
                                null,
                                null,
                                0
                        ),
                        0
                );
        assertEquals("should return the biggest value",test.findMaximumValue(rootVal),0 );



    }

}