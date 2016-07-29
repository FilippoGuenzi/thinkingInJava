package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.c;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a.Outer;

// Not allowed to extend type we can't even access
// public class Inheritor extends Inner {}

public class Inheritor extends Outer {

    // Not allowed. Type access prevents it : Inner is a private class and the only class which has access to it is the enclosing class
    // Inner inner;

    public static void main(String[] args) {

        // Not allowed even if the constructor is public. Type access prevents it : Inner is a private class
        // new Inheritor().new Inner(5);

        // Not allowed even if the constructor is public. Type access prevents it : Inner is a private class
        // Not allowed even through an allowed instance since the context it's still this external method.
        // new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();
        new Inheritor().inner();

        // Not Allowed even if members are public : because reference type is private.
        // Even if we have access to the reference, the reference type access still can stop us from having access to "accessible" members.
        // new Outer().inner().pub();
        // int a = new Outer().inner().i;

    }
}
