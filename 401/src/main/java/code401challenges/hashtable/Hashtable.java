package code401challenges.hashtable;

import code401challenges.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Hashtable {
    public HashNode[] arr;
    public Hashtable(){
        arr = new HashNode[2];
    }
    public void add(String key, String value){
        int hashIndex = hash(key, arr.length);
        if(arr[hashIndex] == null){
            arr[hashIndex] = new HashNode(key, value);
        }
        //colision, rebuild new arr w/ longer array
        else {
            HashNode[] temp = new HashNode[arr.length+1];
            temp[hash(key, temp.length)] = new HashNode(key,value);
            for(int i = 0; i < arr.length; i ++){
                //we have a value here
                if(arr[i] != null){
                    hashIndex = hash(arr[i].getKey(), temp.length);
                    //another collision
                    if (temp[hashIndex]!= null){
                        temp = new HashNode[temp.length+1];
                        if(temp.length > 1000){
                            System.out.println("what");
                        }

                        i = 0;
                        temp[hash(key, temp.length)] = new HashNode(key,value);
                    }
                     temp[hashIndex] = arr[i];
                }
            }
            arr = temp;
        }
    }
    public HashNode get(String key){
        int hashIndex = hash(key, arr.length);
        return arr[hashIndex];
    }
    public boolean contains(String key){
        int hashIndex = hash(key, arr.length);
        return arr[hashIndex] != null;
    }
    private int hash(String key, int arrLeng){
        int accum = 0;
        int prime = 641;
        char[] letters = key.toCharArray();
        for(int i = 0; i < letters.length; i++){
            accum += letters[i];
        }
        return (accum * prime) % arrLeng;
    }
    private List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> tree_intersection(TreeNode node1, TreeNode node2){
        arr = new HashNode[2];
        treeIntersectRecurseAndCheck(node1);
        treeIntersectRecurseAndCompare(node2);
        return res;
    }
    private void treeIntersectRecurseAndCheck(TreeNode node){
        if(node == null){
            return;
        }
        add(node.sValue,"Value Doesn't matter");
        treeIntersectRecurseAndCheck(node.left);
        treeIntersectRecurseAndCheck(node.right);
    }
    private void treeIntersectRecurseAndCompare(TreeNode node){
        if(node == null){
            return;
        }
        if(!contains(node.sValue)){
            res.add(node);
        }
        treeIntersectRecurseAndCompare(node.left);
        treeIntersectRecurseAndCompare(node.right);
    }
}
