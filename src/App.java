// Class: 
// App (for UI setup, input receiving, and displaying output)
// Attributes: 
// BetAmnt (int)
// Balance(int)
// UserCardTotal(int)
// DealerCardTotal(int)
// userCards (array of Cards)
//  dealerCards (array of Cards)
// Constructors:
//  App - sets up UI with HBOX, VBOX, with text: House Hand, Your Hand, Result
// Also sets up buttons (HIT, STAND) , and a textfield for the user to input their bet, it will also update based off inputs like the balance and more.

// Methods: 
// userHit: returns void, calls hit method from the class Game
// userStand: returns void,  calls stand method from class Game
// getBetAmnt: returns int specifically the value of the variable BetAmnt

public class App {
    public int balance;
    public static void main(String[] args) {
    System.out.println("commit and synch");
      //54 cards in the deck
        Card[] deck = new Card[54];
        int i = 0;
        deck[i++] = new Card();  // first joker
        deck[i++] = new Card();  // 2nd joker

        // using a nested loop to create 4 suits per card value & with 13 card values --> 52 total combinations
        for (int value = 1; value <= 13; value++) {
            for (int suit = 1; suit <= 4; suit++) {
                deck[i++] = new Card(value, suit); //add it to the deck
            }
        }

        for (Card card : deck) {// for each card in the deck
            System.out.println(card); //print the card
            System.out.println(Card.getNumCards());
        }
    }

    public App(){

    }
    public int getBalance(){
        return balance;
    }


}
//static is call it on the class