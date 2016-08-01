package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise07;

public class Outer {

    private int i = 0;

    private void method() {
        System.out.println("outer class method; i = " + i);
    }

    public class Inner {

        public void method() {
            i++;
            Outer.this.method();
        }

    }

    public void method2() {
        Inner inner = new Inner();
        inner.method();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method2();
    }
}
