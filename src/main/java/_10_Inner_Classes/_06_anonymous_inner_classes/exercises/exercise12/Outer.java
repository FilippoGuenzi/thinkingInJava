package _10_Inner_Classes._06_anonymous_inner_classes.exercises.exercise12;

public class Outer {

    private int i = 0;

    public int getI() {
        return i;
    }

    private void m() {
        System.out.println("private outer turnCycle m");
    }

    public Inner method() {
        return new Inner() {

            public void modifier() {
                i = i + 10;
                m();
            }
        };
    }

}

abstract class Inner {

    public abstract void modifier();
}
