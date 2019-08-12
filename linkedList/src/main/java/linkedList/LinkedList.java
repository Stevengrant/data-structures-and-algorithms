/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import java.lang.reflect.Type;


class Node <T> {
    T value;
    Node next;
    Node (T value, Node next){
        this.value = value;
        this.next = next;
    }

}
public class LinkedList<T> {
    Node head;

    LinkedList(){
        this.head = null;
    }

    public void insert( T value){
        Node newNode = new Node(value, head);
        this.head = newNode;
    }
    public boolean includes(T value){
        Node node = this.head;

        while(node.next != null){
            if(node.value.equals(value)){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public String isAlive(){
        return new String("Am alive");
    }
    public String toString(){
        String res = new String();
        Node node = this.head;
        while(node.next != null){
            res+=node.value + ",";
            node = node.next;
        }
        res+=node.value;
        return res;
    }
}