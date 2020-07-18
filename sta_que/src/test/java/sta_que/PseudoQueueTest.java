package sta_que;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue ps= new PseudoQueue();
        assertNull("shouldn't have anything in the q's", ps.stack1.top);
        assertNull("shouldn't have anything in the q's", ps.stack2.top);
        ps.enqueue(2);
        assertEquals("Should have the values in stack one when inserted", ps.stack1.top.value, 2);
        ps.enqueue(3);
        assertEquals("Should have the values in stack one when inserted", ps.stack1.top.value, 3);
    }

    @Test
    public void dequeue() {
        PseudoQueue ps= new PseudoQueue();
        ps.enqueue(1);
        ps.enqueue(2);
        ps.enqueue(3);
        ps.enqueue(4);
        assertEquals("Should have the values in stack one when inserted", ps.dequeue() , 1);
        assertEquals("Should have the values in stack one when inserted, and return them when dequed", ps.dequeue() , 2);
        assertEquals("Should have the values in stack one when inserted", ps.dequeue() , 3);
        assertEquals("Should have the values in stack one when inserted", ps.dequeue() , 4);
    }
}