package _10_Inner_Classes._07_factory_method_revisited.exercises.exercise16;

public class External {
    public static void turnCycle(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.turn();
    }
    public static void main(String[] args) {
        turnCycle(Unicycle.factory);
        turnCycle(Bicycle.factory);
        turnCycle(Tricycle.factory);
    }
}
