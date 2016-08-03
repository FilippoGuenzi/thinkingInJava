package _10_Inner_Classes._06_anonymous_inner_classes.exercises.exercise12;

public class External {

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner inner = o.method();
        inner.modifier();
        System.out.println(o.getI());
    }
}
