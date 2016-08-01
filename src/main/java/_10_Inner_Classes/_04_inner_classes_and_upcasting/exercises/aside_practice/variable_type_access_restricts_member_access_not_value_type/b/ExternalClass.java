package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.variable_type_access_restricts_member_access_not_value_type.b;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.variable_type_access_restricts_member_access_not_value_type.Interface;
import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.variable_type_access_restricts_member_access_not_value_type.a.SamePackageClassGivingIndirectAccess;

public class ExternalClass
{
    public static void main(String[] args){
        new ExternalClass().method();
    }
    public void method()
    {
        Interface classToBeAccessed = new SamePackageClassGivingIndirectAccess().method();

        //Allowed
        classToBeAccessed.method();
    }
}
