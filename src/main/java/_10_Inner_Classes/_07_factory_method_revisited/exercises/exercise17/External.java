package _10_Inner_Classes._07_factory_method_revisited.exercises.exercise17;

public class External {
    public static void playTossingGame(TossingGameFactory factory){
        TossingGame game = factory.getTossingGame();
        game.toss();
    }

    public static void main(String[] args) {
        playTossingGame(Dice.factory);
        playTossingGame(Coin.factory);
    }
}
