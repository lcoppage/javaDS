import java.util.*;
import java.math.*;
public class main{

    static privateClass pClass;
    public static void main(String args[]){
        pClass = new privateClass();
        boolean win = false;
        System.out.println("Take a guess!");
        while(!win){
            win = makeGuess();
        }
    }
        public static boolean makeGuess(){
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        boolean win = pClass.guessHN(guess);
        return win;
    }   
    

}