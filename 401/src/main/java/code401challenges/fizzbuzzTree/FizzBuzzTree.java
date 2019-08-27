package code401challenges.fizzbuzzTree;

import code401challenges.tree.BinaryTree;
import code401challenges.tree.TreeNode;

public class FizzBuzzTree {
    TreeNode root;
    public FizzBuzzTree(){
        this.root = null;
    }
    public TreeNode fizzyTree(TreeNode node){
        if(node == null){
            return null;
        }
        //https://stackoverflow.com/questions/3993982/how-to-check-type-of-variable-in-java
        if(!node.value.getClass().getName().equals("String")){
            if( (Integer) node.value % 3 == 0 && (Integer) node.value % 5 == 0)
            {node.value = "FizzBuzz";}
            else if ((Integer) node.value % 3 == 0 )
            {node.value = "Fizz";}
            else if ((Integer) node.value % 5 == 0 )
            {node.value = "Buzz";}
        }

        fizzyTree(node.left);
        fizzyTree(node.right);
        return null;
    }

}
