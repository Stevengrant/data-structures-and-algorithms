package code401challenges.fizzbuzzTree;

import code401challenges.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void Test_FizzBuzzTree() {
        TreeNode testNodeLeft = new TreeNode(new TreeNode(null,null,15),null, 4);
        TreeNode testNodeRight = new TreeNode(new TreeNode(null,null,1),null, 5);
        TreeNode testNode = new TreeNode(testNodeLeft,testNodeRight, 3);
        FizzBuzzTree test = new FizzBuzzTree();
        test.root = testNode;
        test.fizzyTree(test.root);
        assertTrue(test.root.value.equals("Fizz"));
        assertTrue(test.root.left.value.equals(4));
        assertTrue(test.root.right.value.equals("Buzz"));
        assertTrue(test.root.left.left.value.equals("FizzBuzz"));
    }
}