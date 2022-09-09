public class linkedList {
    node head; // starting node of linked list

         linkedList(){
            head = new node();
        }
        //prints out all items in the linked list
        void printItems(){
            node current = head;
            while(current!= null){
                System.out.println(current.data);
                current = current.next;
            }
        }
        //adds new node to end of the linked list. 
        void add(Object data){
            node current = head;
      
          while(current.next != null){
            current = current.next;
        }

        if(current.data == null){
            current.data = data;
        }
        else{
        current.next = new node(data);
        }
    }
        
    void printReverse(){
       //method that mr. durrett used
        /*node current = null;
        node end_goal = null;

        /*if(head.next!=null){
            while(current!=head){ // runs until the current is the same as the head which was the first current node
                current = head;
                while(current.next != end_goal){//going to parse through until null the first time and then set the end goal to the current one which will be the last in the list
                    current = current.next;
                }
                end_goal = current; //sets the end to the current and then prints that out until the real time current equals the head(which is the orignal current)
                System.out.println(current.data);
                }
            }
            else{// if there isn't more than one in the list than just print the head
                System.out.println(head.data);
            }
        }*/





       
       
       node current = head;
        int index = 0;
        while (current.next != null){
            index+=1;
            current = current.next;
        }
        for(int i = index - 1; i>=0; i--){
            current = head;
            for(int j = i; j>= 0; j--){
                current = current.next;
            }
            System.out.println(current.data);
        }
    } 
    


        void remove(Object data){
            node current = head;
            node last = head;
            boolean found = false; //have we found the data in the list?
            while(current != null){
                if(current.data == data){
                    if(current == head){
                        head = current.next;
                    }
                    else{
                    last.next = current.next;
                    }
                    System.out.println("found and removed" + data);
                    found = true;
                    break;
                }
                last = current;
                current = current.next;
            }
            if(!found){
            System.out.print("could not find"  + data);
        }
    }
        node getAtIndex(int index){
            int i = 0;
            node current = head;
            while(i<index){
                if(current == null){
                    return null;
                }
                else{
                    current = current.next;
                    i++;  
                }
            }
            return current;
        }   

        int getIndexOf(Object data){
            node current = head;
            int i = 0;
            while(current != null && current.data != data){
                current = current.next;
                i++;
            }
            if(current == null){
                return -1;
            }
            return i;
            
        }
}







    


