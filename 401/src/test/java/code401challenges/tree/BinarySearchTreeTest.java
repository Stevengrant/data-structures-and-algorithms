package code401challenges.tree;


import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void test_BinarySearchTree(){
        TreeNode node = new TreeNode(null,null,5);
        BinarySearchTree test = new BinarySearchTree(node);
        assertTrue("should have value and return true", test.contains(5));
        assertFalse("Contains should return false if nothing present", test.contains(6));
        test.add(4);
        assertTrue("Should check if added value",test.contains(4));
        assertFalse(test.contains(3));
        test.add(3);
        assertTrue(test.contains(3));
        test.add(66);
        assertTrue(test.contains(66));
    }


}