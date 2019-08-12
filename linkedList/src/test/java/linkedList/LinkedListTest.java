/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest{
    LinkedList classUnderTest = new LinkedList();

    @Test public void testSomeLibraryMethod() {
        assertTrue("Compiles and is alive",classUnderTest.isAlive().equals("Am alive"));
    }
    @Test public void test_InstantiatedLinkedListHasAHeadValueOfNullOnInstantiation() {
        assertNull("Head next should be null when created and nodes haven't been added.", classUnderTest.head);
    }
    @Test public void test_LinkedList_includesAddsANewNode(){
        assertNull("Before we add a node, head should be null.",classUnderTest.head);
        classUnderTest.insert(new String("this is a node."));
        assertNotNull("After we add a node, head should be the new node's pointer",classUnderTest.head);
    }
    @Test public void test_includes_returnsTrueWhenNodeIsPresent(){
        classUnderTest.insert(new String("Trees"));
        classUnderTest.insert(new String("Streams"));
        classUnderTest.insert(new String("Bushes"));
        classUnderTest.insert(new String("Mountains"));
        assertTrue("Returns true when value is present",classUnderTest.includes(new String("Bushes")));
        assertTrue("Returns true when value is present",classUnderTest.includes(new String("Mountains")));

    }
    @Test public void test_includes_returnsFalseWhenNodeIsNotPresent(){
        classUnderTest.insert(new String("Salmon"));
        classUnderTest.insert(new String("Tooth brush"));
        classUnderTest.insert(new String("Old Skool Hip Hop"));
        classUnderTest.insert(new String("Mints"));
        assertFalse("Returns False when value is not present",classUnderTest.includes(new String("Pinya Colatta")));
    }
    @Test public void test_toString_returnsAStringOfALinkedListsValues(){
        classUnderTest.insert(new String("Salmon"));
        classUnderTest.insert(new String("Tooth brush"));
        classUnderTest.insert(new String("Old Skool Hip Hop"));
        classUnderTest.insert(new String("Mints"));
        assertTrue("Returns a string of the values", classUnderTest.toString().equals("Mints,Old Skool Hip Hop,Tooth brush,Salmon"));
    }
}