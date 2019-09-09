package code401challenges.InsertionSort;

public class InsertionSort {

//    InsertionSort(int[] arr)
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
    //From assignment requirements
//    FOR i = 1 to arr.length
//    int j <-- i - 1
//    int temp <-- arr[i]
//    WHILE j >= 0 AND temp < arr[j]
//    arr[j + 1] <-- arr[j]
//    j <-- j - 1
//    arr[j + 1] <-- temp
}
