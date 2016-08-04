package _10_Inner_Classes._07_factory_method_revisited.exercises.exercise16;

public class Tricycle implements Cycle {

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Tricycle();
        }
    };

    public void turn() {
        System.out.println("Tricycle turn");
    }
}
