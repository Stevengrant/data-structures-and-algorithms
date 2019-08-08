package code401challenges;

public class binarySearch {
//    public static int[] insertShiftArray(int[] arrayToBeShifted, int intToBeAdded) {
    public int BinarySearch(int[] sortedArr, int target){
        int pivot =(sortedArr.length-1)/2;
        int prevPivot = -1;
        int res = -1;
        do {
            System.out.println(pivot);
            if (sortedArr[pivot] < target){
                prevPivot = pivot;
                pivot= (int)(pivot/2 + sortedArr.length/2);
                //Check Right
            }
            if (sortedArr[pivot] > target ){
                prevPivot = pivot;
                pivot = pivot/2;
                //Check Left
            }
            if (sortedArr[pivot] == target ){
                res = pivot;
                break;
            }
            if (pivot == prevPivot){
                return -1;
            }

        }
        while(true);
        return res;
    }
    }
