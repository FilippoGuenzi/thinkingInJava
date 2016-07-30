package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.type_access_restricts_member_access.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.type_access_restricts_member_access.Interface;

public class SamePackageClassGivingIndirectAccess
{
    public Interface method(){
        return new ClassToBeAccessed();
    }
}
