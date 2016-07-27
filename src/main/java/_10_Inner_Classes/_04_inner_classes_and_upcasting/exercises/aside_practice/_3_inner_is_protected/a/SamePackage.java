package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a.Outer.Inner;

public class SamePackage {

    // Allowed type access : Inner is a protected
    Inner inner;

    public static void main(String[] args) {

        // Not allowed from here because constructor is private
        // outer.new Inner(5l);

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is protected.
        // - constructor is accessible from here : same package and type of Inner(boolean b) is package
        new Outer().new Inner(true);

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is protected.
        // - constructor is accessible from here : same package and type of Inner(String s) is protected
        new Outer().new Inner("a");

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is protected.
        // - constructor is accessible from here : same package and type of Inner(int i) is public
        new Outer().new Inner(5);

        // Indirect access through public method which has access to private members.
        new Outer().inner();
    }

}
