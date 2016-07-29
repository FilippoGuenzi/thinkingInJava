package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.b;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a.Outer;

public class External {

    // Not allowed. Type access prevents it : Inner is a package class and the only classes which have access to it are the classes in the same package
    // Inner inner;

    public static void main(String[] args) {

        // Not allowed even through an allowed instance since the context it's still this external method
        // new Outer().new Inner(5);

        // Indirect access through accessible (public) method which has access to Outer private members.
        new Outer().inner();

        // Not Allowed even if members are public : because reference type is package and we're outside of the referenced class package.
        // Even if we have access to the reference, the reference type access still can stop us from having access to "accessible" members.
        // new Outer().inner().pub();
        // int a = new Outer().inner().i;
    }
}
