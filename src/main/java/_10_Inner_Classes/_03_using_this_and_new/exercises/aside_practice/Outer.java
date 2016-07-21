package _10_Inner_Classes._03_using_this_and_new.exercises.aside_practice;

public class Outer {

    public static class Inner {
    }

    public static Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        // here we create an inner class instance without the outer class instance and we can do it only because the Inner class is static
        Inner inner = Outer.inner();
    }
}
