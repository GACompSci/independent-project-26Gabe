

public class Game {
    public int balance;
    public boolean drawcard;
    public int userTotal;
    public int dealerTotal;
    public boolean userWon;
    private Deck gameDeck=new Deck();
    private Hand dealerHand = new Hand(3,gameDeck);
    private Hand gamerHand = new Hand(3,gameDeck);
    public Game(){

    }
public boolean userWon(){
if(userTotal>dealerTotal&&userTotal<=21){
    //i think there is an edgecase where they both fail
userWon=true;
} else if(dealerTotal>userTotal && dealerTotal<=21){
    userWon=false;
}
    return true;
}
public int resultOfBet(){
    return 10;
}
public int getBalance(int balance){
    return 10;
}
public void hit(){

}
public void stand(){
drawcard=false;
}
}

// Class: Game (for betting, balance, & determining the winner)
// Attributes: BetAmount, deck, hand for both players, EVERY VARIABLE
// Constructors: Game - give out the cards
// Methods: determineWinner, resultOfBet, balance, hit and stand

// Class: App
// Constructors: App - & what it does
// Attributes: None
// Methods: main, and UI
