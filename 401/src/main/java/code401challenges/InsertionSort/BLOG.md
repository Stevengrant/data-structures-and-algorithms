# Insertion Sort


So I guess the first step is to define what success looks like:
When we pass an array to InsertionSort, it needs to sort it.

ie :

3, 5, 1, 2 => 1, 2, 3, 5

Here's the psudo code (shamelessly yoinked from the code challenge requirements)

```
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```

Lets go over what we want to do:

We're going to iterate over the array, but there's a little deviation from how we normally do it, we're starting i at 1 (or the second item in the array)
J is `i -1` or the first item in the array;

```
3 5 1 2
^ ^
j   i
```
We also set temp to be the value at i;
```
int temp = 5
```
Then we enter a while loop. 
```
 while (j >= 0 && temp < arr[j])
```

In there, while our temp value is less then our value at j, we shift j over. Through our loops, we basically push everything over until its in order. 