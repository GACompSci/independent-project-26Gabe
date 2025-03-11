// Class:
//  Game (for betting, balance, & determining the winner)
// Attributes: 
// betAmount (int)
// houseHand (array of Cards)
//  userHand (array of Cards)
// Deck (array of Cards), 
// userWon (boolean)
// userCardTotal (int)
// dealerCardTotal (int)
// userBalance (int)
// Constructors: 
// Game - makes deck, hands out cards, assigns user balance, hands out desired initial cards, 
// Methods: 
// DidUserWin: returns boolean
// resultOfBet: returns integer
// updateBalance: returns void
// Hit: returns void
// Stand: returns void


// Source code is decompiled from a .class file using FernFlower decompiler.
public class Game {
    public int balance;
    public boolean drawcard;
    public int userTotal;
    public int dealerTotal;
    public boolean userWon;
    private Deck gameDeck = new Deck();
    private Hand dealerHand;
    private Hand gamerHand;
    public boolean tie = false;
    public int betAmount=10; // change this eventually
 
    public Game() {
       this.dealerHand = new Hand(3, this.gameDeck);
       this.gamerHand = new Hand(3, this.gameDeck);
    }
 
    public boolean userWon() {
        // 5 cases 
        //user >  dealer & both <=21 
        //dealer > user & both <=21
        //tie
        //user <= 21 dealer >21
        //dealer<=21 user >21
        if(this.userTotal<=21&&this.dealerTotal>21){
            this.userWon=true;
            tie=false;
            return true;
        }
       if (this.userTotal > this.dealerTotal && this.userTotal <= 21) {
          this.userWon = true;
          tie=false;
          return true; 
       }
       if(this.userTotal==this.dealerTotal){
        this.userWon=true;
        tie=true;
        return true;
       }
       tie=false;
       return false;
    }
 
    public int resultOfBet(int betAmmount) {
        balance-=betAmount;
if(this.userWon==true&& tie==false){
balance+=betAmount*2;
return betAmmount*2;
} else if(this.userWon==true&&tie==true){
    balance+=betAmount;
    return betAmount;
}
return -betAmount;
}
    
 
    public void hit() {
    this.drawcard=true;
    }
 
    public void stand() {
       this.drawcard = false;
    }
public void dealer(){
//if
}
 }

 