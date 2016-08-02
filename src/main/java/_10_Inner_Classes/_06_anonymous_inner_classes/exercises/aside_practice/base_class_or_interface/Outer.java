package _10_Inner_Classes._06_anonymous_inner_classes.exercises.aside_practice.base_class_or_interface;

public class Outer {

    Interface inter = new Interface() {

        private int i;

    };
    private static BaseClass bC;

    static {
        bC = new BaseClass() {
        };
    }
}
