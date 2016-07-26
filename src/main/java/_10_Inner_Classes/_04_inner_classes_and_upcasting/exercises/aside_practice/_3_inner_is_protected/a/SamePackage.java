package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a.Outer.Inner;

public class SamePackage {

    public static void main(String[] args) {
        SamePackage samePackage = new SamePackage();
        samePackage.method();
    }

    public void method() {
        Outer outer = new Outer();

        // Allowed from here because same package and type of Inner is protected.
        Inner inner;

        // Not allowed from here because constructor is private
        // outer.new Inner(5l);

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is protected.
        // - constructor is accessible from here : same package and type of Inner(boolean b) is package
        outer.new Inner(true);

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is protected.
        // - constructor is accessible from here : same package and type of Inner(String s) is protected
        outer.new Inner("a");

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is protected.
        // - constructor is accessible from here : same package and type of Inner(int i) is public
        outer.new Inner(5);

        // Indirect access through public method which has access to private members.
        outer.inner();
    }
}
