package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.b;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a.Outer;

public class External {

    // Not allowed. Type access prevents it : Inner is a protected class and the only classes which have access to it are the classes in the same package and
    // the inheritors
    // Inner inner;

    public static void main(String[] args) {

        // Not allowed even through an allowed instance since the context it's still this external turnCycle
        // new Outer().new Inner(5);

        // Indirect access through accessible (public) turnCycle which has access to Outer private members.
        new Outer().inner();

        // Not Allowed even if members are public : because reference type is protected and we're outside of the referenced class package and we'er not
        // inheriting from the enclosing class.
        // Even if we have access to the reference, the reference type access still can stop us from having access to "accessible" members.
        // new Outer().inner().pub();
        // int a = new Outer().inner().i;
    }

}
