public class dataStructure {
    public static void main(String[] args){
    linkedList llist = new linkedList();
    llist.add(5);
    llist.add(6);
    llist.add(7);
    System.out.println(llist.getAtIndex(2).data);
    System.out.println(llist.getAtIndex(5));
    System.out.println(llist.getAtIndex(0).data);
    }
}