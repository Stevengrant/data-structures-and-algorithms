package code401challenges.Graph.GetEdge;

import code401challenges.Graph.GNode;
import code401challenges.Graph.Graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void getEdge() {
        GNode root = new GNode("Detroit");
        Graph graph = new Graph(root);
        GNode cin = new GNode("Cincinati");
        GNode sf = new GNode("San Francisco");
        graph.addEdge(root,cin,145);
        graph.addEdge(root,sf,260);
        GNode city4 = new GNode("City 4");
        graph.addEdge(sf,city4,260);
        GetEdge getEdge = new GetEdge();
        int res1 = getEdge.getEdge(sf, root);
        int res2 = getEdge.getEdge(root, city4);
        assertTrue( res1== 260);
        assertTrue(res2 == -1);
    }
}