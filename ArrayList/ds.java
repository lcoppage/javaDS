public class ds {
    public static void main(String[] args){
        int z = 1;
        int d = 2;
        int f = 3;
        int q = 4;
        ArrayList firstList = new ArrayList(4);
            firstList.add(z);
            firstList.add(d);
            firstList.add(f);
            firstList.add(q);
        
        firstList.printStrings();
        firstList.remove(d);
        firstList.printStrings();
        firstList.get(1);
        firstList.contains(d);
    }

}

 
