package _10_Inner_Classes._07_factory_method_revisited.exercises.exercise16;

public class Unicycle implements Cycle {

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Unicycle();
        }
    };

    public void turn() {
        System.out.println("Unicycle turn");
    }
}
