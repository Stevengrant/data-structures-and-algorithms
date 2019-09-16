package code401challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void add() {
        Hashtable test = new Hashtable();
        for(int i =0; i < 10; i++){
            test.add(i + "key" + i,"Bar");
        }
        assertTrue(test.arr[9].key.equals("0key0"));
        assertTrue(test.arr[11].key.equals("1key1"));
        assertTrue(test.arr[27].key.equals("9key9"));
    }

    @Test
    public void get() {
        Hashtable test = new Hashtable();
        for(int i =0; i < 10; i++){
            test.add(i + "key" + i,"Bar");
        }
        HashNode res = test.get("0key0");
        assertTrue(res.key.equals("0key0"));
    }

    @Test
    public void contains() {
        Hashtable test = new Hashtable();
        assertFalse(test.contains("7key7"));
        for(int i =0; i < 10; i++){
            test.add(i + "key" + i,"Bar");
        }
        assertTrue(test.contains("0key0"));
        assertTrue(test.contains("7key7"));
    }
}