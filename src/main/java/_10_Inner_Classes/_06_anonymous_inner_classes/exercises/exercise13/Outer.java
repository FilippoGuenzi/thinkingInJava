package _10_Inner_Classes._06_anonymous_inner_classes.exercises.exercise13;

public class Outer {
    public Interface method() {
        return new Interface() {
            public void method() {

            }
        };
    }
}
