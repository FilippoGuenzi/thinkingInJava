package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a.Outer.*;

public class SamePackage {

    public static void main(String[] args) {

        // Not allowed. Type access prevents it : Inner is a private class
        // Inner inner;

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();

        new SamePackage().method();

    }

    public void method() {
        // Not allowed. Type access prevents it : Inner is a private class
        // Inner inner;

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);

        // Indirect access through accessible (public) method which has access to Outer private members.
        new Outer().inner();
    }
}
