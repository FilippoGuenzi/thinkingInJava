package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.Interface;

public class SamePackage {

    // Not allowed. Type access prevents it : Inner is a private class and the only class which has access to it is the enclosing class
    // Inner inner;

    public static void main(String[] args) {

        // Not allowed even through an allowed instance since the context it's still this external turnCycle
        // new Outer().new Inner(5);

        // Indirect access through accessible (public) turnCycle which has access to Outer private members.
        new Outer().inner();

        // Not Allowed even if members are public : because reference type is private.
        // Even if we have access to the reference, the reference type access still can stop us from having access to "accessible" members.
        // new Outer().inner().pub();
        // int a = new Outer().inner().i;

        // In fact it's variable type that can restrict access to members, not value type.
        Interface inner = new Outer().inner();
        inner.pub();
    }
}
