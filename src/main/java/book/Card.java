package book;

public class Card {
    int number;
    int bulls;
    Card(int n, int b){
        number = n;
        bulls = b;
    }
    int getNumber(){
        return number;
    }
    int getBulls(){
        return bulls;
    }
    String printCard(){
        return("[ " +number+", "+bulls+" ]");
    }
}
