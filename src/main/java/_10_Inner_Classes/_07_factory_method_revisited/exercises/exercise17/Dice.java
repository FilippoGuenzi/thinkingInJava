package _10_Inner_Classes._07_factory_method_revisited.exercises.exercise17;

public class Dice implements TossingGame {

    public void toss() {
        System.out.println("Toss dice");
    }

    public static TossingGameFactory factory = new TossingGameFactory() {
        public TossingGame getTossingGame() {
            return new Dice();
        }
    };
}
