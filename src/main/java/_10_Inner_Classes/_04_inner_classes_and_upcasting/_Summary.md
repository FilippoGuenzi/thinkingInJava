Non inner classes can only be public, package.
Inner classes can be private, package, protected, public. 

Enclosing class has full access to all members of its inner class from public to private, and the other way round.

The access of an Inner class behaves the same as the access of other members of the enclosing class :
- private : access restricted to the class itself (and to the enclosing class and to its inner classes)
- package :  access restricted to the same package
- protected : access restricted to the same package and to the inheritors of the enclosing class
- public : access to every class

**Class access and members access**
The access of a class determines :
- the possibility to declare variables of this type in a given class
- the possibility to instantiate the class/get a reference of it (also determined by its constructors access) (without mentioning indirect access)
The access to its members is restricted by the reference variable type, not by the reference value type : if you can get a reference of a private class through indirect access and try to get public members :
- you can't if the reference variable is typed with its value type.
- you can if the reference variable is typed with a public interface the class extends.

So the access to the members of a class is restricted by the class access. 

**Indirect access**
It's not because a class member has an access (private, package, protected) that stops us to use it directly in a scope that we can not use it in that scope.
We can maybe have access to it indirectly through a method we have access to, which has access to it.
Public Getters of private fields is the first example we had of it.
For example a reference of a private inner class can be returned in an external class having no direct access to the inner class
through a method of the enclosing class to which the external class has access.
