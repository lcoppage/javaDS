import java.util.Scanner;
import java.io.FileReader;
public class card {
    String name;
    int value;

    public card(String n){
        name = n;
    }

    String returnName(){
        return name;
    }

    int returnValue(){
       if(name.equals("two")){
        value = 2;
        return value;
       }
       if (name.equals("three")){
        value = 3;
        return value;
       }
       if (name.equals("four")){
        value = 4;
        return value;
       }
       if (name.equals("five")){
        value = 5;
        return value;
       }
       if (name.equals("six")){
        value = 6;
        return value;
       }
       if (name.equals("seven")){
        value = 7;
        return value;
       }
       if (name.equals("eight")){
        value = 8;
        return value;
       }
       if (name.equals("nine")){
        value = 9;
        return value;
       }
       if (name.equals("ten")){
        value = 10;
        return value;
       }
       if (name.equals("jack") || name.equals("queen") || name.equals("king")){
        value = 10;
        return value;
       }
       if (name.equals("ace")){
            Scanner aceVal = new Scanner(System.in);
            System.out.println("what value do you want your ace to equal(in number form)");
            value = Integer.parseInt(aceVal.nextLine());
            return value;
       }
       return -1;
       }
    }

