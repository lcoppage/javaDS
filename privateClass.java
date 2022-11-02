class privateClass{

    private int hidden_number;
    private int max;
    public privateClass(){
        max = (int)(Math.random()*10) + 10;
        hidden_number = (int)(Math.random()*max) + min;
        rerollHN();
        System.out.println(hidden_number);
    }

    public int getHN(){
        return hidden_number;
    }

    private void rerollHN{
        int min = (int)(Math.random()*100);
        hidden_number = (int)(Math.random()*max) + min;
        System.out.println("range:" + min + "-->" + max);
     }

public boolean guessHN(int n){
    if(n==hidden_number){
        System.out.println("You got it! You win!");
        return true;
    }
    System.out.println("WRONG! Guess again!");
    max--;
    rerollHN();
    return false;
}


}