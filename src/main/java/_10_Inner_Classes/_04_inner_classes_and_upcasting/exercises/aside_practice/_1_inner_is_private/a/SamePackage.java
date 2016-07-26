package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a;

public class SamePackage {

    public static void main(String[] args) {
        SamePackage samePackage = new SamePackage();
        samePackage.method();
    }

    public void method() {
        Outer outer = new Outer();

        // Not allowed because type access is private.
        // Inner inner;

        // Not allowed even if the constructor is public. Type access prevents it.
        // outer.new Inner(5);

        // Indirect access through public method which has access to private members.
        outer.inner();
    }
}
