package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.c;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a.Outer;

public class Inheritor extends Outer {

    public static void main(String[] args) {
        Outer outer = new Outer();

        //Not allowed
        //Inner inner;

        //Not allowed
        //outer.new Inner();

        //Allowed through public constructor
        outer.inner();

    }
}
