package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.b;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a.Outer;

public class External {

    public static void main(String[] args) {
        // Not allowed. Type access prevents it : Inner is a private class
        // Inner inner;

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();

        new External().method();
    }

    public void method() {
        // Not allowed. Type access prevents it : Inner is a package class
        // Inner inner;

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);

        // Indirect access through accessible (public) method which has access to Outer private members.
        new Outer().inner();
    }
}
