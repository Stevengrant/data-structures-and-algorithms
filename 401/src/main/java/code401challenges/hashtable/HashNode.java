package code401challenges.hashtable;

public class HashNode {

    String value;
    String key;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HashNode(String key, String value){
        this.value = value;
        this.key = key;
    }
}
