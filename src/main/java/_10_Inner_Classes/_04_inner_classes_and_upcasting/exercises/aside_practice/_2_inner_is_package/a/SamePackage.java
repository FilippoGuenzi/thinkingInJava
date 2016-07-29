package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a.Outer.Inner;

public class SamePackage {

    // Allowed type access : Inner is package and here we are in the same package
    Inner inner;

    public static void main(String[] args) {

        // Not allowed from here because constructor is private
        // new Outer().new Inner(5l);

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is package.
        // - constructor is accessible from here : same package and type of Inner(boolean b) is package
        new Outer().new Inner(false);

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is package.
        // - constructor is accessible from here : same package and type of Inner(String s) is protected
        new Outer().new Inner("a");

        // Allowed from here because :
        // - type is accessible from here : same package and type of Inner is package.
        // - constructor is accessible from here : same package and type of Inner(int i) is public
        new Outer().new Inner(5);

        // Indirect access through public method which has access to private members.
        new Outer().inner();

        // Allowed because :
        // - reference type allows access to its members
        // - members access allows access to them
        new Outer().inner().pub();
        new Outer().inner().pro();
        new Outer().inner().pac();
        // Not allowed because of member access (private)
        // new Outer().inner().pri();

        // Allowed because :
        // - reference type allows access to its members
        // - members access allows access to them
        int a = new Outer().inner().i;
        int b = new Outer().inner().j;
        int c = new Outer().inner().k;
        // Not allowed because of member access (private)
        // int d = new Outer().inner().l;

    }
}
