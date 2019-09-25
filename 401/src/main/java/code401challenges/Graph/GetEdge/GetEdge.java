package code401challenges.Graph.GetEdge;

import code401challenges.Graph.GEdge;
import code401challenges.Graph.GNode;

import java.util.List;

public class GetEdge {
    public int getEdge(GNode node1, GNode node2 ){
        List<GEdge> edges = node1.getEdges();
        for (int i = 0; i < edges.size(); i++){
            if(edges.get(i).getLeft() == node2){
                return edges.get(i).getWeight();
            }
        }
        return -1;
    }
}
