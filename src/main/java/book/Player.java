package book;

import java.util.ArrayList; // import just the ArrayList class
import java.util.Arrays;

public class Player {
    String name;
    ArrayList<Card> hand = new ArrayList<>();
    Player(String newName) {
        name=newName;
    }
}
