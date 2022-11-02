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
    
    public String popString(){
        node temp = head;
        if(head!= null){
            head = head.next;
        }
        String myString = "Card" + " " + temp.data;
        return myString.toString();
    }

    Object pop(){
        node temp = head;
        if(head!= null){
        head = head.next;
        }
        return temp.data;
    }

    Object get(int i){
        node temp = head;
        for(int k=0; k<i; k++){
            temp = temp.next;
        }
        return temp.data;
    }

    Object pop(int n){ 
        Object temp = head;
        int i = 0;
        while(i<n && temp != null){
            temp = pop();
            i++;
        }
        return temp;
    }
    
     void printStack(){
        while(head.next != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

         int countStack(){
            int count = 1;
            while(head.next != null){
                count++;
                head = head.next;
            }
            return count;
        }




        
    }
