package fifo_animal_shelter;

public class Node {
    Animal value;
    Node next;
    public Node(Animal value, Node next) {
        this.value = value;
        this.next = next;
    }
}
