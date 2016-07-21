package _10_Inner_Classes._01_creating_inner_classes.exercises.exercise01;

public class Outer {

    class Inner {

    }

    public Inner in() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.in();
    }
}
