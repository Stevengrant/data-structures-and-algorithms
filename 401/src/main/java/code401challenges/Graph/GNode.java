package code401challenges.Graph;

import java.util.ArrayList;
import java.util.List;

public class GNode {
    public GNode(String value){
        this.edges = new ArrayList(){};
        this.value = value;
    }
    public GNode addNode(String val){
        GNode node = new GNode(val);
        GEdge newEdge = new GEdge(node, this,0);
        node.edges.add(newEdge);
        this.edges.add(newEdge);
        return node;
    };
    public GNode addNode(GNode node){
        GEdge newEdge = new GEdge(node, this,0);
        node.edges.add(newEdge);
        this.edges.add(newEdge);
        return node;
    };
    private List edges;
    private String value;

    public List<GEdge> getEdges() {
        return edges;
    }

    public void setEdges(List edges) {
        this.edges = edges;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
