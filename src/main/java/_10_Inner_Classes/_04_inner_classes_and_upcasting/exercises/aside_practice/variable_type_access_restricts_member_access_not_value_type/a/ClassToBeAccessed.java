package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.variable_type_access_restricts_member_access_not_value_type.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.variable_type_access_restricts_member_access_not_value_type.Interface;

class ClassToBeAccessed implements Interface {

    public int a = 5;

    public void method() {
        System.out.println("method in ClassToBeAccessed running");
    }
}
