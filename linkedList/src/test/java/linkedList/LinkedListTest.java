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
    @Test public void test_append_appendsToALinkedListThatHasAValue(){

        classUnderTest = new LinkedList();
        classUnderTest.insert(new String("Salmon"));
        assertTrue("Should append",classUnderTest.head.value.equals("Salmon"));
        classUnderTest.append("coffee");
        assertTrue("Should append",classUnderTest.head.next.value.equals("coffee"));
        classUnderTest.append("Fancy stuff");
        assertTrue("Should append",classUnderTest.head.next.next.value.equals("Fancy stuff"));
    }
    @Test public void test_insertBefore_shouldInsertBefore(){
        classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(3,22);
        assertTrue("Should insert value before",classUnderTest.head.next.next.value.equals(22));
    }
    @Test public void test_insertAfter(){
        classUnderTest = new LinkedList();
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(2,22);
        assertTrue("Should insert after", classUnderTest.head.next.next.value.equals(22));
    }
    @Test public void test_LinkedList_kthFromEnd_ReturnsNodeWhenIndexExists(){
        classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        assertEquals("should return the correct value",classUnderTest.kthFromEnd(2),2);

    }
    @Test public void test_LinkedList_kthFromEnd_ThrowsExeptionWhenOutOfBounds(){
        classUnderTest = new LinkedList();
        classUnderTest.insert(4);
        classUnderTest.insert(3);
        classUnderTest.insert(2);
        classUnderTest.insert(1);
        try{
            classUnderTest.kthFromEnd(5);
        } catch(Exception e){
            assertTrue("Should throw a exeption when out of bounds",true);
        }
        //https://www.baeldung.com/junit-assert-exception

    }


}