import BlackJack.node;

public class doubleLinkedList {
    node head; // starting node of linked list
    node tail;
         public doubleLinkedList(){
            head = new node();
            tail = head;
        }

        void printItems(){
            node current = tail;
            while(current!= null){
                System.out.println(current.data);
                current = current.next;
            }
        }
//adds new node to end of the linked list. 
        void add(Object data){
            if(tail==head && head.data==null){
                head.data = data;
            }
            else{
                tail.next = new node(data);
                tail.next.prev = tail;
                tail = tail.next;
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

       /* void printReverse(Object data){
            node current = tail;
            while(current != null){
                System.out.println(current.data);
                current = current.prev;
            }
        }*/

        void printReverse(){
            node current = head;
            node last = head;
            boolean found = false;
            int index = 0;
            while (current.next != null){
                index+=1;
                current.next = current;
                
            }
            
            for(int i = index; i > 0; index --){
                current = head;
                System.out.print(current);
            }

            } 
            
        }



