public class Stack{ //last in first out
    node head;
    Stack(Object data){
        //push puts in, pop takes out
        head = new node(data);
    }

    void push(Object data){
        node temp = new node(data);
        temp.next = head;
        head = temp;
    }

    Object pop(){
        node temp = head;
        if(head!= null){
        head = head.next;
        }
        return temp.data;
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