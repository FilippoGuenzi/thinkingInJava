package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.c;

// Not allowed to extend type we can't even access
// public class Inheritor extends Inner {}

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a.Outer;

public class Inheritor extends Outer {
    // Not Allowed since Inner is private
    // Inner inner;

    public static void main(String[] args) {

        // Not allowed. Type access prevents it : Inner is a private class
        // Inner inner;

        // Not allowed even if the constructor is public. Type access prevents it : Inner is a private class
        // new Inheritor().new Inner(5);

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();
        new Inheritor().inner();

        new Inheritor().method();
    }

    public void method() {
        // Not allowed. Type access prevents it : Inner is a private class
        // Inner inner;

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);
        // this.new Inner(5);

        // Indirect access through accessible (public) method which has access to Outer private members.
        new Outer().inner();
        inner();
    }

}
