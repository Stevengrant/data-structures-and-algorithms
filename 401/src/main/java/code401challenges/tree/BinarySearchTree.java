package code401challenges.tree;

public class BinarySearchTree extends BinaryTree<Integer>{
    TreeNode <Integer> root;

    public void add( Integer value, TreeNode node){
        if(node ==null){
            node = new TreeNode(null,null, value);
            return;
        }
        if( ((Integer) node.value > value)){
            add(value, node.getLeft());
        } else {
            add(value, node.getRight());
        }
    }
    public boolean contains(TreeNode node, Integer searchVal){
        if(node == null){
            return false;
        }
        if((Integer)node.value == searchVal){
            return true;
        } else if ((Integer)node.value >searchVal){
            contains(node.getLeft(),searchVal);
        } else if ((Integer) node.value < searchVal){
            contains(node.getRight(),searchVal);
        }
        return false;
    }
    public BinarySearchTree( TreeNode rootNode) {
        super();
        this.root = rootNode;
    }
}
