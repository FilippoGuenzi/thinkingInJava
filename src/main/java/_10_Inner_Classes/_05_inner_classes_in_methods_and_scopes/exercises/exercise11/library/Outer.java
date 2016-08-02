package _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise11.library;

public class Outer {

    private class Inner implements Interface {
    }

    public Inner inner() {
        return new Inner();
    }

}
