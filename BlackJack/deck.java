import java.util.Scanner;
import java.io.FileReader;
public class deck {
    Stack shuffledStack;
    linkedList listOfCards;
    card assignCard;
    public deck(){
        shuffledStack = new Stack(null);
        listOfCards = new linkedList();
        makeDeck();
        shuffleCards();
        }
        
    public void makeDeck(){
            try{
                Scanner scan = new Scanner(new FileReader("cards.txt"));
            while(scan.hasNext()){
                assignCard = new card(scan.nextLine());
                listOfCards.add(assignCard.name);
            }
                }catch (Exception e){
                e.printStackTrace();
                }  
        }
    
        
    public void shuffleCards(){
                for(int i= 0; i < 52; i++){ 
                int rand = (int)(Math.random() * 52) + 0;
               shuffledStack.push(listOfCards.getDataAt(rand));
            }
        }

    public String revealACardName(){
        String myString = "" + shuffledStack.pop();
        return myString;
    }
    

    
}
            
    


