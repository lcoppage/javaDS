public class Queue{ //last in first out
    node tail;
    node head;
    Queue(Object data){
        //push puts in, pop takes out
        tail = new node(data);
        head = new node(data);
    }

    void push(Object data){
        node temp = new node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    Object pop(){
        node temp = tail;
        if(tail!= null){
        tail = tail.prev;
        return temp.data;
    }
        return null;
    }

    Object pop(int n){
        Object temp = head;
        int i = 0;
        while(i<n && temp!=null){
            temp = pop();
            i++;
        }
        return temp;
    }
}