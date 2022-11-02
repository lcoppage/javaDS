public class game {
    hand playerHand;
    hand cpuHand;

    public game(){
        playerHand = new hand();
        cpuHand = new hand();
        playGame();
    }

    void playGame(){
        printTable();
        System.out.println("Your total is: " + playerHand.sum() + "\n" + "Would you like to hit or stand?");
    }

    void printTable(){
        System.out.println("CPU HAND \n");
        cpuHand.cpuDeal();
        System.out.println("--------------");
        playerHand.playerDeal();
        System.out.print("\n");
        System.out.println("YOUR HAND");
        
    }

    void whoWins(){
        if(playerHand.sum() > cpuHand.sum()){
            

            }
        }
    }


