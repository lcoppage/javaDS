
public class hand {
    linkedList hand;
    deck deck1;

    public hand(){
        hand =  new linkedList();
        deck1 = new deck();
    }
   
    public void playerDeal(){
        for(int i = 0; i < 2; i++){
            hand.add(deck1.revealACardName());
        }
        int total = 0;
        for(int i = 0; i < hand.length(); i++){
            System.out.println(hand.getDataAt(i));
        }
    }

    

    public void cpuDeal(){
       hand.add(deck1.revealACardName());
       hand.add(deck1.revealACardName());
       System.out.println("hidden card");
       System.out.println(hand.getDataAt(1)); 
    }

    public void playerHit(){
        hand.add(deck1.revealACardName());
        int total = 0;
        for(int i = 0; i < hand.length(); i++){
            System.out.println(hand.getDataAt(i));
        }
    }
    
    public void printPlayerHand(){
        int total = 0;
        for(int i = 0; i < hand.length(); i++){
            System.out.println(hand.getDataAt(i));
        }
    }

    public int sum(){
        int total = 0;
        for(int i = 0; i < hand.length(); i++){
            String myString = "" + hand.getDataAt(i);
            card cardN = new card(myString);
            total += cardN.returnValue();
        }
        return total;
    }

    int aceCase(){
      if()
    }

    boolean busted(){
        int total = 0;
        for(int i = 0; i < hand.length(); i++){
            String myString = deck1.revealACardName();
            card cardN = new card(myString);
            total += cardN.returnValue();
        }
        if(total > 21)
            return true;
        else{
            return false;
        }
    }
}
