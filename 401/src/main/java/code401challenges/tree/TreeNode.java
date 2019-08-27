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
    public T value;
    public TreeNode(TreeNode left, TreeNode right, T value){
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
