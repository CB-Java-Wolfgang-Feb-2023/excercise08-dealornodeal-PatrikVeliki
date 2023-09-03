package application;

public class Main {
    public static void main(String[] args) {
        DealOrNoDeal game = new DealOrNoDeal();
        game.initGame();
        game.chooseInitialCase();
        for (int round = 1; round <= 9; round++) {
            game.playRound(round);
        }
        game.finalStage();
    }
}
