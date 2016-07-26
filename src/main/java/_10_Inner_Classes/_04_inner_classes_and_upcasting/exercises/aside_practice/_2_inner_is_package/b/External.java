package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.b;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a.Outer;

public class External {

    public static void main(String[] args) {
        External external = new External();
        external.method();
    }

    public void method() {
        Outer outer = new Outer();

        // Not allowed because type access is package and we are outside of the package.
        // Inner inner;

        // Not allowed even if the constructor is public. Type access prevents it : we're here outside of Inner's package.
        // outer.new Inner(5);

        // Indirect access through public method which has access to private members.
        outer.inner();
    }
}
