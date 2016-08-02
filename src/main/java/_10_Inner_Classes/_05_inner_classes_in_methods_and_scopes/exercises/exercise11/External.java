package _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise11;

import _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise11.library.Interface;
import _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise11.library.Outer;
// import _10_Inner_Classes._05_inner_classes_in_methods_and_scopes.exercises.exercise11.library.Outer.Inner;

public class External {
    public static void main(String[] args) {
        Interface inter = new Outer().inner();
        // Not allowed
        //(Inner)inter;
    }
}
