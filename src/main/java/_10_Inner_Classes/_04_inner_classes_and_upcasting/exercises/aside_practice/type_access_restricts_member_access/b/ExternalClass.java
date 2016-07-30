package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.type_access_restricts_member_access.b;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.type_access_restricts_member_access.Interface;
import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice.type_access_restricts_member_access.a.SamePackageClassGivingIndirectAccess;

public class ExternalClass
{
    public static void main(String[] args){
        new ExternalClass().method();
    }
    public void method()
    {
        Interface classToBeAccessed = new SamePackageClassGivingIndirectAccess().method();

        //Not Allowed
        System.out.println(classToBeAccessed.a);

        //Allowed
        classToBeAccessed.method();
    }
}
