public class linkedList {
    node head; // starting node of linked list

         linkedList(){
            head = new node();
        }

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
        }}

}

