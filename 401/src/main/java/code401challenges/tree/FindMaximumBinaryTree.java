package code401challenges.tree;

public class FindMaximumBinaryTree<T> extends BinaryTree {
    public int findMaximumValue(TreeNode rootNode){
        max = (int)rootNode.value;
        findMax(rootNode);
        return max;
    }
    private int max;
    private TreeNode findMax(TreeNode treeNode){
        if(treeNode == null){
            return null;
        }
        if ((int)treeNode.value > max){max= (int)treeNode.value;}
        findMax(treeNode.left);
        findMax(treeNode.right);
        return null;
    }
    public FindMaximumBinaryTree(){};

}
