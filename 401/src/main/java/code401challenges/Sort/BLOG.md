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

# Quick Sort
Quick sort is a method to sort an array...quickly.

There are a couple parts at work here:
Quick Sort works with Recursion;

So to kick it off; we call quick sort with three args;
1) The first is the array we're looking to sort,
2) The second is the low index, when we invoke it at first, its 0;
3) The Third is the end of the array (length -1)

we start by checking if our low value is (index 0 at the start) is still less then our hight index (length -1 at the start)
If it's not, we're done!

So the first thing we do is set the value partition to be the value we get when we call partition(passing in the array, low, and high index)


in partition, 
we set a prop pivot to be the value of arr\[high], or the last element in the array;

we also set i to be the low index-1 (so -1 to start)

we then itterate;
we have a second itterator (j) which we set to be the value of our low index (0 here)
now we itterate though everything, setting j to be our low value (0) j < high (length -1 here)

For everything we check if arr\[j] < value in pivot( which is the last item in the array;
if it is, we increment i( which is low -1 to begin, so -1 becomes 0)
then we swap the values.

After finishing the loop, we swap the values at i + 1 and high and return i + 1 as the value for partition;

Back to quick sort and we do something strange;

We call quicksort again, this time with low, being the same, and high = partition -1;
We call quicksort again again this time with low being partition + 1, and high being the same.

And we keep doing this until !(low < high);

# Merge Sort
