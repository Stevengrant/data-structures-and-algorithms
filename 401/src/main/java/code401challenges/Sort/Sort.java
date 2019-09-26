package code401challenges.Sort;

public class Sort {
//QUICK SORT
//lots of help from here:
//https://www.geeksforgeeks.org/quick-sort/
 public void quickSort(int[] arr, int low, int high){
     if (low < high){
         int partition = partition(arr, low, high);
         quickSort(arr, low, partition - 1);
         quickSort(arr, partition + 1 , high);
     }
 }
 private int partition(int[] arr, int low, int high){
     int pivot = arr[high];
     int i = low -1;
     for (int j = low; j <high; j++){
         if(arr[j]< pivot){
             i++;
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }
     int temp = arr[i + 1];
     arr[i +1] = arr[high];
     arr[high] = temp;
     return i + 1;
 }
    //INSERTION SORT
    public int[] insertionsort(int[] arr){
        for (int i = 1; i <arr.length; i++){
            int j = i - 1;
            int temp = arr [i];
            while (j >=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public int[] mergeSort(int[] arr){
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
