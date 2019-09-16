package code401challenges.hashtable;

public class Hashtable {
    public HashNode[] arr;
    public Hashtable(){
        arr = new HashNode[2];
    }
    public void add(String key, String value){
        int hashIndex = hash(key, arr.length);
        if(arr[hashIndex] == null){
            arr[hashIndex] = new HashNode(key, value);
        }
        //colision, rebuild new arr w/ 2 length
        else {
            HashNode[] temp = new HashNode[arr.length * 2];
            temp[hash(key, temp.length)] = new HashNode(key,value);
            for(int i = 0; i < arr.length; i ++){
                //we have a value here
                if(arr[i] != null){
                    hashIndex = hash(arr[i].getKey(), temp.length);
                    //another collision
                    if (temp[hashIndex]!= null){
                        temp = new HashNode[temp.length * 2];
                        i = 0;
                        temp[hash(key, temp.length)] = new HashNode(key,value);
                    }
                    temp[hashIndex] = arr[i];
                }
            }
            arr = temp;
        }
    }
    public HashNode get(String key){
        int hashIndex = hash(key, arr.length);
        return arr[hashIndex];
    }
    public boolean contains(String key){
        int hashIndex = hash(key, arr.length);
        return arr[hashIndex] != null;
    }
    private int hash(String key, int arrLeng){
        int accum = 0;
        int prime = 641;
        char[] letters = key.toCharArray();
        for(int i = 0; i < letters.length; i++){
            accum += letters[i];
        }
        return (accum * prime) % arrLeng;
    }
}
