package code401challenges.tree;

public class BinarySearchTree extends BinaryTree<Integer>{
    TreeNode <Integer> root;

    public void add( Integer value){
        boolean goLeft = true;
        TreeNode previous = null;
        TreeNode current = this.root;
        while (current!=null){
            if((Integer)current.value > value){
                goLeft = true;
                previous = current;
                current = current.getLeft();
            }
            else if((Integer)current.value < value){
                goLeft = false;
                previous = current;
                current = current.getRight();
            }
        }
        if(goLeft){
            previous.left = new TreeNode(null,null,value);

        }else {
            previous.right = new TreeNode(null,null,value);
        }
    }
    public boolean contains( Integer searchVal){
        TreeNode current = this.root;
        while(current != null){
            if((Integer)current.value == searchVal){
            return true;
            }
            else if ((Integer)current.value >searchVal){
                current = current.left;
            }
            else if ((Integer) current.value < searchVal){
                current = current.right;
            }
        }
        return false;

    }
    public BinarySearchTree( TreeNode rootNode) {
        super();
        this.root = rootNode;
    }
}
