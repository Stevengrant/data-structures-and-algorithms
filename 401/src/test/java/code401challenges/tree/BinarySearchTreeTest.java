package code401challenges.tree;


import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void test_BinarySearchTree(){
        TreeNode node = new TreeNode(null,null,5);
        BinarySearchTree test = new BinarySearchTree(node);
        assertTrue("should have value and return true", test.contains(test.root,5));
        assertFalse("Contains should return false if nothing present", test.contains(test.root,6));
        test.add(4,test.root);
        assertTrue("Should check if added value",test.contains(test.root,4));
    }


}