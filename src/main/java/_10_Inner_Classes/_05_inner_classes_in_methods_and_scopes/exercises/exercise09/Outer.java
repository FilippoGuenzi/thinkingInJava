package _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise09;

public class Outer {

    public Interface outerMethod() {
        class Inner implements Interface{
            public void method() {}
        }
        return new Inner();
    }
}
