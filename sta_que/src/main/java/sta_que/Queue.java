package sta_que;

public class Queue <T> {
    Node back;
    public Queue (){
        this.back = null;
    }
    public void  enqueue(T value){
    if(back == null){
        this.back = new Node(value, null);
        return;
    }
    this.back = new Node(value, this.back);
    }
    public T dequeue(){

        if(this.back == null){
            throw new NullPointerException("Lol nothing here dude");
        }

        Node current = this.back;
        Node previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        if(previous != null){
            T val = (T) current.value;
            previous.next = null;
            return val;

        }
        this.back = null;
        return (T) current.value;
    }
    public T peek(){
        Node current = this.back;
        if (this.back == null ){
            throw new NullPointerException("This is not the droid you're looking for.");
        }

            while (current.next != null){
            current = current.next;
        }
        return (T)current.value;
    }
}
