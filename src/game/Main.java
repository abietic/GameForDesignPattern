package game;

public class Main {
    public static void main(String[] args) {
        Game game = new AGame();
        game.init();
        game.run();
        game.term();
    }
}
