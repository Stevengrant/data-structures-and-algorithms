package code401challenges.Graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addEdge() {
        GNode node = new GNode("First one");
        GNode node2 = new GNode("Second one");

        Graph graph = new Graph(node);
        assertTrue(graph.getRoot().getEdges().size() == 0);
        assertTrue(node2.getEdges().size() == 0);

        graph.addEdge(node, node2);

        assertTrue(graph.getRoot().getEdges().size() == 1);
        assertTrue(node2.getEdges().size() == 1);

        GEdge rootEdge =  graph.getRoot().getEdges().get(0);
        int edgeWeight = rootEdge.weight;
        assertTrue(edgeWeight == 0);

        GNode node3 = new GNode("Third one");
        GNode node4 = new GNode("Fourth one");
        graph.addEdge(node3,node4,420365);

        assertTrue(node3.getEdges().get(0).weight == 420365);
        assertTrue(node4.getEdges().get(0).weight == 420365);


    }

    @Test
    public void getNodes() {
        GNode root = new GNode("THIS IS THE ROOT");
        Graph graph = new Graph(root);
        root.addNode("Child Node 1",0);
        root.addNode("Child Node 2",0);
        root.addNode("Child Node 3",0);
        root.addNode("Child Node 4",0);
        root.addNode("Child Node 5",0);
        root.addNode("Child Node 6",0);
        root.addNode("Child Node 7",0);
        root.getEdges().get(0).getLeft().addNode("Child 8",0);
        root.getEdges().get(0).getLeft().addNode("Child 9",0);
        root.getEdges().get(0).getLeft().addNode("Child 10",0);
        root.getEdges().get(0).getLeft().addNode("Child 11",0);
        root.getEdges().get(0).getLeft().addNode("Child 12",0);
        root.getEdges().get(0).getLeft().getEdges().get(0).getLeft().addNode(root);
        List<GNode> res = graph.getNodes();

        assertTrue(res.size() ==13);
    }

    @Test
    public void getNeighbors() {
        GNode root = new GNode("THIS IS THE ROOT");
        Graph graph = new Graph(root);
        root.addNode("Child Node 1",0);
        root.addNode("Child Node 2",0);
        root.addNode("Child Node 3",0);
        root.addNode("Child Node 4",0);
        root.addNode("Child Node 5",0);
        root.addNode("Child Node 6",0);

        List<GNode> res = graph.getNeighbors(root);

        assertTrue(res.size() == 6);
    }

    @Test
    public void size() {
        GNode root = new GNode("THIS IS THE ROOT");
        Graph graph = new Graph(root);
        root.addNode("Child Node 1",0);
        root.addNode("Child Node 2",0);
        root.addNode("Child Node 3",0);
        root.addNode("Child Node 4",0);
        root.addNode("Child Node 5",0);
        root.addNode("Child Node 6",0);
        root.addNode("Child Node 7",0);
        root.getEdges().get(0).getLeft().addNode("Child 8",0);
        root.getEdges().get(0).getLeft().addNode("Child 9",0);
        root.getEdges().get(0).getLeft().addNode("Child 10",0);
        root.getEdges().get(0).getLeft().addNode("Child 11",0);
        root.getEdges().get(0).getLeft().addNode("Child 12",0);
        root.getEdges().get(0).getLeft().getEdges().get(0).getLeft().addNode(root);
        List<GNode> res = graph.getNodes();

        assertTrue(graph.size() == 13);
    }
}