package code401challenges.Sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void quickSort() {
        //odd array w/ 1-9
        int[] unsortedArray = new int[]{9,4,2,5,6,1,3,7,8};
        int[] sortedArray = new int[]{1,2,3,4,5,6,7,8,9};
        Sort sort = new Sort();
        sort.quickSort(unsortedArray, 0, unsortedArray.length -1);
        assertArrayEquals(unsortedArray,sortedArray);

        unsortedArray = new int[]{1,4,2,5,6,9,3,7,8};
        sortedArray = new int[]{1,2,3,4,5,6,7,8,9};
        sort.quickSort(unsortedArray, 0, unsortedArray.length -1);
        assertArrayEquals(unsortedArray,sortedArray);
    }
    @Test
    public void insertionsort() {
        Sort test = new Sort();
        int[] unordered = new int[]{ 5, 8, 3 };
        int[] res = test.insertionsort(unordered);
        int[] expected = new int[]{3,5,8};
        assertTrue(res[0] == expected[0]);
        assertTrue(res[1] == expected[1]);
        assertTrue(res[2] == expected[2]);
    }
//    @Test
    public void test_mergeSort(){
        int[] unsortedArray = new int[]{9,4,2,5,6,1,3,7,8};
        int[] sortedArray = new int[]{1,2,3,4,5,6,7,8,9};
        Sort sort = new Sort();
        sort.mergeSort(unsortedArray);
        assertArrayEquals(unsortedArray,sortedArray);

    }
}