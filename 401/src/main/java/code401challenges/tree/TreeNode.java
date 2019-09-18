package code401challenges.tree;

public class TreeNode<T> {
    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode left;
    public TreeNode right;



    T value;
    public String sValue;
    public TreeNode(TreeNode left, TreeNode right, T value){
        this.left = left;
        this.right = right;
        this.value = value;
        this.sValue = value.toString();
    }
    public TreeNode(TreeNode left, TreeNode right, String value){
        this.left = left;
        this.right = right;
        this.sValue = value;
    }
}
