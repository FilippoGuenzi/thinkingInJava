Inner classes can be private, package, protected, public while non inner classes can only be public, package.

Why non-inner classes have only public and package access :
- private is useless if type cannot be accessed from outside : nobody can use the class. While inner private classes can be accessed by encapsulating class.
- protected can give access only to package classes and inheritors in the same package since the type is not defined outside. Inheritors in the same package only need package access. Additional rights provided by protected inner classes with respect to package inner classes is not the access provided to the inheritors of the inner class (type still not accessible from outside the package) but to the inheritors of the encapsulating class. (to check but I think its the case). Well, in fact protected is defined only for members of a class (if we extend this member notion also to Inner classes) and since a non inner class is not a member of any other class it's hard to apply it.

Enclosing class has full access to all members of its inner class from public to private, as it is the other way round.

**Class access and members access are independent**
The access of a class determines :
- the possibility to declare variables of this type in a given class
- the possibility to instantiate the class/get a reference of it (also determined by its constructors access) (without mentioning indirect access)

The access to the members of the class can be larger or smaller than that of the class and determines the access to the members independently from the access to the class.
For example we can do public constructors of private classes, private constructors of public classes (as in singletons). 

The access of an Inner class behaves the same as the access of other members of the enclosing class :
- private : access restricted to the class itself (and to the enclosing class and to its inner classes)
- package :  access restricted to the same package
- protected : access restricted to the same package and to the inheritors of the enclosing class
- public : access to every class

**Indirect access**
It's not because a class member has an access (private, package, protected) that stops us to use it directly in a scope that we can not use it in that scope.
We can maybe have access to it indirectly through a method we have access to, which has access to it.
Public Getters of private fields is the first example we had of it.
For example a reference of a private inner class can be returned in an external class having no direct access to the inner class
through a method of the enclosing class to which the external class has access.
