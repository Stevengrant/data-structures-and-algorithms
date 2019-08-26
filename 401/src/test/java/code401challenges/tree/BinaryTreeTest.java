package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void test_getRootNode() {
        TreeNode testNode = new TreeNode(null,null, "FIRST");
        BinaryTree test = new BinaryTree(testNode);
        assertTrue("Root node getter should return root node", test.getRootNode().value.equals("FIRST"));
    }

    @Test
    public void test_preOrder() {
        TreeNode testNodeLeft = new TreeNode(null,null, "Left");
        TreeNode testNodeRight = new TreeNode(null,null, "Right");
        TreeNode testNode = new TreeNode(testNodeLeft,testNodeRight, "Root");
        BinaryTree test = new BinaryTree(testNode);
        assertEquals("Array list should have values", test.preOrder().size(), 3);
        assertTrue("First element should be root val", test.preOrder().get(0).equals("Root"));
        assertTrue("Second element should be right val", test.preOrder().get(1).equals("Right"));
        assertTrue("Third element should be right val", test.preOrder().get(2).equals("Left"));
    }
    @Test
    public void test_inOrder() {
        TreeNode testNodeLeft = new TreeNode(null,null, "Left");
        TreeNode testNodeRight = new TreeNode(null,null, "Right");
        TreeNode testNode = new TreeNode(testNodeLeft,testNodeRight, "Root");
        BinaryTree test = new BinaryTree(testNode);
        assertEquals("Array list should have values", test.inOrder().size(), 3);
        assertTrue("First element should be root val", test.inOrder().get(0).equals("Left"));
        assertTrue("Second element should be right val", test.inOrder().get(1).equals("Root"));
        assertTrue("Third element should be right val", test.inOrder().get(2).equals("Right"));
    }
    @Test
    public void test_postOrder() {
        TreeNode testNodeLeft = new TreeNode(null,null, "Left");
        TreeNode testNodeRight = new TreeNode(null,null, "Right");
        TreeNode testNode = new TreeNode(testNodeLeft,testNodeRight, "Root");
        BinaryTree test = new BinaryTree(testNode);
        assertEquals("Array list should have values", test.postOrder().size(), 3);
        assertTrue("First element should be Left val", test.postOrder().get(0).equals("Left"));
        assertTrue("Second element should be right val", test.postOrder().get(1).equals("Right"));
        assertTrue("Third element should be root val", test.postOrder().get(2).equals("Root"));
    }
}