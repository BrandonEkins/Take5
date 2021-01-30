package book;

import java.util.ArrayList; // import just the ArrayList class
import java.util.Arrays;


public class Game {
    //Bull values
    final ArrayList<Integer> cattle7 = new ArrayList<>(Arrays.asList(55));
    final ArrayList<Integer> cattle5 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 66, 77, 88, 99));
    final ArrayList<Integer> cattle3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
    final ArrayList<Integer> cattle2 = new ArrayList<>(Arrays.asList(5, 15, 25, 35, 45, 65, 75, 85, 95));

    ArrayList<Card> deck = new ArrayList<>();
    
    Game() {
        //create the game deck
        for (int i = 1; i < 105; i++) {
            if (cattle7.contains(i)){
                deck.add(new Card(i,7));
            }
            else if (cattle5.contains(i)){
                deck.add(new Card(i,5));
            }
            else if (cattle3.contains(i)){
                deck.add(new Card(i,3));
            }
            else if (cattle2.contains(i)){
                deck.add(new Card(i,2));
            }
            else{
                deck.add(new Card(i,1));
            }
        }
    }

    void printDeck() {
        for (Card card : deck) {
            System.out.println(card.printCard());
        }
    }
}

