package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.c;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._3_inner_is_protected.a.Outer;

// Not allowed to extend type we can't even access
// public class Inheritor extends Outer.Inner {}

public class Inheritor extends Outer {

    // Allowed because Inner type is a protected member of Outer and is therefore accessible to Outer inheritors.
    Inner inner;

    public static void main(String[] args) {

        // Allowed because :
        // Inner type is a protected member of Outer and is therefore accessible to Outer inheritors.
        // Constructor is accessible
        new Inheritor().new Inner(5);

        // Not allowed because :
        // Even if Inner type is a protected member of Outer and is therefore accessible to Outer inheritors.
        // Constructor is not accessible since it's protected and therefore accessible only to classes in Inner package or to Inner inheritors. Inheritor
        // extends Outer to have access to Outer protected members, it doesn't extend Inner and can't have direct access to Inner protected members.
        // new Inheritor().new Inner("a");

        // Not allowed because :
        // Even if Inner type is a protected member of Outer and is therefore accessible to Outer inheritors.
        // Constructor is not accessible since it's package and therefore accessible only to classes in Inner package.
        // new Inheritor().new Inner(true);

        // Not allowed because :
        // Even if Inner type is a protected member of Outer and is therefore accessible to Outer inheritors.
        // Constructor is not accessible since it's public.
        // new Inheritor().new Inner(5l);

        // Allowed
        new Outer().new Inner(5);

        // Allowed through indirect access
        new Outer().inner();
        new Inheritor().inner();

        // Allowed because :
        // - reference type allows access to its members
        // - members access allows access to them
        new Outer().inner().pub();

        // Not allowed because of member access (private, package, protected)
        // Here it's normal not to have access to protected Inner's members because we're not inheriting from Inner but from Outer
        // new Outer().inner().pri();
        // new Outer().inner().pac();
        // new Outer().inner().pro();

        // Allowed because :
        // - reference type allows access to its members
        // - members access allows access to them
        int a = new Outer().inner().i;

        // Not allowed because of member access (private, package, protected)
        // Here it's normal not to have access to protected Inner's members because we're not inheriting from Inner but from Outer
        // int b = new Outer().inner().j;
        // int c = new Outer().inner().k;
        // int d = new Outer().inner().l;

    }

}
