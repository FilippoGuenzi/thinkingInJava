Syntax :
new InterfaceOrBaseClass(){...class definition here...};

Anonymous inner classes, as they are defined in a statement are defined anywhere a statement is accepted : 
- whether in a method
- or in a field initialisation
- or in a static bloc

Some things worth mentioning about Contents contents = new Contents(){//Class definition here}; :
- it doesn't mean I am creating on the fly a new Contents class and instantiating it.
- it creates a new class with no name
- the created class 
    - inherits from Contents if contents is a class 
    - or implements Contents if contents is an interface
- it creates a new instance of this anonymous class which is immediately upcast to its base class or interface
- it therefore requires the Contents class/interface to exists

Since there's just the place for one name after new, an anonymous inner class cannot :
- extend a base class and implement an interface at the same time.
- implement more than one interface at the same time

Since anonymous inner classes have no name they can't have a constructor, this requiring a name.
For field initialisation :
- whether the field is in the base class and can be initialized by the base class constructor
- or you initialize the field in the field declaration, passing the value as a **final** parameter of the enclosing method :
    public MyInterface method(final String s){
        return new MyInterface(){
            private String address = s;
        }
    }
    It looks strange here that s can go through the new Interface(){} scope without it passing the value.
    In fact it's not a real scope. MyInterface is just an upcast of a new object of a new class, so MyInterface() is not a constructor nor a method.
-
