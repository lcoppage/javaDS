public class node { 
//head node should never have a previous and a tail should never have a 
//next so when coding remeber to set thse to null
    Object data;
    node next; // next node in the linked list
    node prev; // previous node in the linked list
    node(){}    

    node(Object d){
    data = d;    
}
}
