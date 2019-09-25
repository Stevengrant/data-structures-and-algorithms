package code401challenges.Graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GNodeTest {

    @Test
    public void addNode() {
        GNode root = new GNode("ROOT NODE");
        GNode addNodeReturnVal = root.addNode("Child Node",0);
        assertTrue(root.getEdges().size() > 0);
        assertTrue(addNodeReturnVal.getEdges().size() > 0);
        GNode thirdNode = root.addNode("Third Node",0);
        assertTrue(root.getEdges().size() == 2);


    }


}