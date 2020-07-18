package sta_que;

public class Stack<T> {
    Node <T> top;
    Stack(){
        this.top = null;
    }
    public void push(T value){
    if(this.top == null){
        this.top = new Node<T>(value,null);
    }
    Node node = new Node<T>(value, top);
    this.top = node;
    }

    public T pop() {
        if(this.top == null){
            return null;
        }
        T val = this.top.value;
        this.top = this.top.next;
        return val;
    }

    public T peek() {
        try{
            return this.top.value;
        } catch (NullPointerException e){
            return null;
        }
    }
}
