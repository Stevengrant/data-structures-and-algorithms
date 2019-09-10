package code401challenges;

public class MergeSort {
    public int[] mergesort(int[] arr){
        int n = arr.length;
        if ( n > 0){
            int mid = (int) Math.ceil(n/2);
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++){
                left[i] = arr[i];
            }
            int j =0;
            int[] right = new int[n-mid];
            for(int i = mid; i < n; i ++){
                right[j] = arr[i];
                j++;
            }
        }
        return arr;
    }
    private int[] merge (int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <left.length && j < right.length){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        if(i == left.length){
            while(i<left.length){
                arr[k] = left[i];
                i++;
                k++;
            }
        //set remaining entries in arr to remaining values in right

        }
        else {
            while(i<left.length){
                arr[k] = right[j];
                i++;
                k++;
            }
        // set remaining entries in arr to remaining values in left
        }
    return arr;
    }
}
