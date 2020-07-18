package sta_que;

public class PseudoQueue <T>{
    Stack stack1;
    Stack stack2;
    public PseudoQueue(){
        stack1 = new Stack();
        stack2 = new Stack();
    }
    public void enqueue(T value){
        stack1.push(value);
    }
    public T dequeue(){
        // shift everything over to the 2nd stack;
        Node current = stack1.top;
        while(current != null){
            stack2.push(current.value);
            current = current.next;
        }
        //res
        T res = (T) stack2.pop();
        //Reset
        current = stack2.top.next;
        stack1 = new Stack();
        while (current != null){
            stack1.push(current.value);
            current = current.next;
        }
        return res;
    }
}
