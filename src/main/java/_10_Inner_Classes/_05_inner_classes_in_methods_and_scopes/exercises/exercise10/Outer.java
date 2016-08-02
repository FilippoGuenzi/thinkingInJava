package _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise10;

public class Outer {

    public Interface outerMethod(boolean b) {
        if(b) {
            class Inner implements Interface {

                public void method() {}
            }
            return new Inner();
        }
        return null;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Interface inter = outer.outerMethod(true);
    }
}
