package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergesort() {
        int[] test = new int[]{4,6,3,2};
        MergeSort mergeSort = new MergeSort();
        int[] res = mergeSort.mergesort(test);
        int[] expeted = new int[]{2,3,4,6};
        assertArrayEquals(res,expeted);
    }
}