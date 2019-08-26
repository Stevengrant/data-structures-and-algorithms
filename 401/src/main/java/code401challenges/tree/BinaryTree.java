package code401challenges.tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    public BinaryTree() {

    }

    public TreeNode<T> getRootNode() {
        return rootNode;
    }

    private TreeNode<T> rootNode;
    private ArrayList<T> result;
    //https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
    //https://github.com/codefellows/seattle-java-401d5/blob/master/class-14/tree%20recursion.jpg
    public ArrayList <T> preOrder(){
        result = new ArrayList<T>();
        preOrderPrivate(rootNode);
        return result;
    }
    private TreeNode preOrderPrivate (TreeNode treeNode){
        //Root=>Left=>Right
        if( treeNode ==null){
            return null;
        }
        result.add((T) treeNode.value);
        result.add((T) treeNode.getRight().value);
        result.add((T) treeNode.getLeft().value);
        return null;

    };
    public ArrayList<T> inOrder(){
        result = new ArrayList<T>();
        inOrderPrivate(rootNode);
        return result;
    };
    private TreeNode inOrderPrivate (TreeNode treeNode) {
        //Left=>Root=>Right
        if(treeNode == null){
            return null;
        }
        result.add((T) treeNode.getLeft().value);
        //root
        result.add((T) treeNode.value);
        result.add((T) treeNode.getRight().value);
        return null;

    };
    private TreeNode postOrderPrivate (TreeNode treeNode) {
        //Left=>Right=>Root
        if(treeNode == null){
            return null;
        }
        result.add((T) treeNode.getLeft().value);
        result.add((T) treeNode.getRight().value);
        //root
        result.add((T) treeNode.value);
        return null;

    };

    public ArrayList<T> postOrder(){
        result = new ArrayList<T>();
        postOrderPrivate(rootNode);
        return result;
    };
    public BinaryTree (TreeNode rootNode){
        this.rootNode = rootNode;
    }
}
