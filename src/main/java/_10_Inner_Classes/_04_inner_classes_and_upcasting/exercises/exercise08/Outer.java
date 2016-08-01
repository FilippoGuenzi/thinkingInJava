package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise08;

public class Outer {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }

    public void method() {
        Inner inner = this.new Inner();
        inner.method();
        System.out.println(inner.i);
    }

    public class Inner {

        private int i = 5;

        private void method() {
            System.out.println("on est dans la méthode private de l'inner class");
        }
    }
}
