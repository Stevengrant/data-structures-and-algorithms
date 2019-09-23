package code401challenges.Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public GNode getRoot() {
        return root;
    }

    private GNode root;

    public Graph (GNode root){
        this.root = root;
    };
    public void addEdge(GNode left, GNode right, int weight){
        GEdge edge = new GEdge(left,right, weight);
        left.getEdges().add(edge);
        right.getEdges().add(edge);
    }
    public void addEdge(GNode left, GNode right){
        GEdge edge = new GEdge(left,right, 0);
        left.getEdges().add(edge);
        right.getEdges().add(edge);
    }
    //nodes after GetNodes is finished
    private List<GNode> allNodes = new ArrayList<>();
    private boolean sawRoot = false;
    public List<GNode> getNodes(GNode root){
        recurseGetNodes(root);
        return allNodes;
    };
    public List<GNode> getNodes(){
        if (this.root == null) {
            return null;
        }
        recurseGetNodes(this.root);
        return allNodes;
    };
    private void recurseGetNodes (GNode node){
        if((sawRoot && node == root) || node == null){
            return;
        }
        if (!sawRoot){sawRoot = true;}
        if(!allNodes.contains(node)){
            allNodes.add(node);
        } else {
            return;
        }
        List<GEdge> edges = node.getEdges();
        for(int i = 0; i < edges.size(); i++){
            recurseGetNodes(edges.get(i).getLeft());
        }
    }
    public List<GNode> getNeighbors(GNode node){
        List<GNode> res = new ArrayList<>();
        for(int i = 0; i < node.getEdges().size(); i++){
            res.add( node.getEdges().get(i).getRight());
        }
        return res;
    }
    public int size (){
        return getNodes(this.root).size();
    }
}
