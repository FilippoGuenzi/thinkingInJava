package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.c;

// Not allowed to extend type we can't even access
// public class Inheritor extends Inner {}

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a.Outer;

public class Inheritor extends Outer {
    // Allowed
    Inner inner;

    public static void main(String[] args) {

        // Allowed
        Inner inner;;

        // Allowed
        new Inheritor().new Inner(5);

        // Allowed
        new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();
        new Inheritor().inner();

        new Inheritor().method();
    }

    public void method() {
        // Allowed
        Inner inner;;

        // Allowed
        new Inner(5);

        // Allowed
        new Outer().new Inner(5);
        this.new Inner(5);

        // Indirect access through accessible (public) method which has access to Outer private members.
        new Outer().inner();
        this.inner();
    }

}
