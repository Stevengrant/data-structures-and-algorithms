/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void test_insertShiftArray(){
        ArrayShift arrayShift = new ArrayShift();
        int[]testArray = new int[]{1,2,3,4,5,6};
        int[]result = new int[]{1,2,3,99,4,5,6};
        assertArrayEquals("New Value is inserted into the array", arrayShift.insertShiftArray(testArray, 99),result);
    }

    //Binary Search

//    @Test public void test_binarySearch_evenInput_containsVal(){
//        binarySearch classUnderTest = new binarySearch();
//
//    }
    @Test public void test_binarySearch_evenInput_containsVal(){
        binarySearch classUnderTest = new binarySearch();
        int[] inputArr = new int[]{1,2,3,4,5,6};
        int target = 2;
        assertEquals("Binary search finds the element's index  when its in the first half of the arr", classUnderTest.BinarySearch(inputArr,target),1);
        target = 5;
        assertEquals("Binary search finds the element's index  when its in the last half of the arr", classUnderTest.BinarySearch(inputArr,target),4);
        target = 3;
        assertEquals("Binary search finds the element's index when its in the middle of the arr", classUnderTest.BinarySearch(inputArr,target),2);
    }

    @Test public void test_binarySearch_evenInput_doesNotContainVal(){
        binarySearch classUnderTest = new binarySearch();
        int[] inputArr = new int[]{1,2,3,4,5,6};
        int target = 7;
        assertEquals("Binary search returns -1 when the element isn't in the arr", classUnderTest.BinarySearch(inputArr,target),-1);
    }
    @Test public void test_binarySearch_oddInput_containsVal(){
        binarySearch classUnderTest = new binarySearch();
        int[] inputArr = new int[]{1,2,3,4,5};
        int target = 2;
        assertEquals("Binary search finds the element's index  when its in the first half of the arr", classUnderTest.BinarySearch(inputArr,target),1);
        target = 5;
        assertEquals("Binary search finds the element's index  when its in the last half of the arr", classUnderTest.BinarySearch(inputArr,target),4);
        target = 3;
        assertEquals("Binary search finds the element's index when its in the middle of the arr", classUnderTest.BinarySearch(inputArr,target),4);
    }
}

