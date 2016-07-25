package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise06.inheritor;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise06.api.DoThis;
import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise06.imp.Outer;

public class Child extends Outer {

    public static DoThis parentInner() {
        Outer outer = new Outer();
        return outer.new Inner();
    }

    public static void main(String[] args) {
        DoThis dT = parentInner();
        dT.doThis();
    }


}
