Why non-inner classes have only public and package access :
- private is useless if type is not access from outside : nobody can use the class. While inner private classes can be accessed by encapsulating class.
- protected can give access only to package classes and inheritors in the same package since the type is not defined outside. Inheritors in the same package only need package access. Additional rights provided by protected inner classes with respect to package inner classes is not the access provided to the inheritors of the inner class (type still not accessible from outside the package) but to the inheritors of the encapsulating class. (to check but I think its the case).    

A reference of a private inner class can be returned in an external class having no direct access to the inner class
through a method of the enclosing class to which the external class has access.

From a class having no access to Inner :
• outer.inner() is allowed when inner delivers a reference of the inner class
• outer.new Inner() isn't allowed though :
    • not because the constructor is directly called from a place which hasn't access to it (doesn't work even if the constructor is public).
    • but because Inner type is not accessible from there
    • in fact this syntax is allowed when type is accessible **AND!!!** constructor is accessible.
    
**Class access and members access are independent**
The access of a class determines :
- the possibility to declare variables of this type.
It doesn't determine :
- the possibility to instantiate the class (constructor access)
- the access to its members (fields and methods)

The access to the members of the class can be larger or smaller than that of the class and determines the access to the members independently from the access to the class.
For example we can do public constructors of private classes, private constructors of public classes (as in singletons). 

**Indirect access**
It's not because a member or constructor has an access (private, package, protected) that stops us to use it directly in a scope that we can not use it in that scope.
We can maybe have access to it indirectly through a method we have access to, which has access to it.
Public Getters of private fields is the first example we had of it.



