Inner classes can be private, package, protected, public while non inner classes can only be public, package.

An inner private class can only be accessed by its enclosing class and by its inner classes.
Well here we can be more precise and distinguish :
- type access
- reference access
- member access

Enclosing class has full access to all members of its inner class from public to private, as it is the other way round.
