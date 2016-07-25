package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise06.imp;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.exercise06.api.DoThis;

public class Outer {

    protected class Inner implements DoThis {

        public Inner() {
        }

        public void doThis() {
            System.out.println("here we are");
        }
    }

}
