package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.c;
import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a.Outer;

// Not allowed to extend type we can't even access
// public class Inheritor extends Inner {}

public class Inheritor extends Outer {

    // Not allowed. Type access prevents it : Inner is a package class and the only classes which have access to it are the classes in the same package
    // Inner inner;

    public static void main(String[] args) {

        // Not Allowed
        // new Inheritor().new Inner(5);

        // Not allowed even if the constructor is public. Type access prevents it : Inner is a package class and we're here outside of its package
        // Not allowed even through an allowed instance since the context it's still this external method.
        // new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();
        new Inheritor().inner();

    }

}
