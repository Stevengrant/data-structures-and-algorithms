package code401challenges;

public class ArrayShift {
   public static int[] insertShiftArray(int[] arrayToBeShifted, int intToBeAdded) {
       int middle = (int)(arrayToBeShifted.length/2);
       int[] result = new int[arrayToBeShifted.length+1];
       int indexOfInsertion = 0;

       for( int i = 0; i < arrayToBeShifted.length; i++){
           if(i == middle){
               result[indexOfInsertion]=intToBeAdded;
               indexOfInsertion++;
           };
           result[indexOfInsertion]=arrayToBeShifted[i];
           indexOfInsertion++;
       }
       return result;
   };
}
