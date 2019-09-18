package code401challenges.hashtable;

import code401challenges.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void add() {
        Hashtable test = new Hashtable();

        test.add("Bugles" , "bar");
        test.add("vjvfiu4" , "bar");
        test.add("ojjfr9j4" , "bar");
        test.add("as" , "bar");
        test.add("325th64" , "bar");
        test.add("egrgRWw5g" , "bar");
        assertTrue(test.arr.length >6);
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
    @Test
    public void test_tree_intersection(){
       
    }
}