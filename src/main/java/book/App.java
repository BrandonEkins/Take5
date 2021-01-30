package book;


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Game take5 = new Game();
        take5.printDeck();
    }
}
