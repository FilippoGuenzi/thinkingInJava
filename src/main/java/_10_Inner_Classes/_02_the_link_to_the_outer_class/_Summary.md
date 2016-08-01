Inner class has access to all outer class members (from private to public) as if it owned them (and the other way round).

Except for static inner classes (called nested classes) you always need an outer class object to instanciate one of its inner classes object.
The inner class object automatically and tacitely gets a reference to its outer class object from which it has been instanciated,
which allows him to get access to all its members.
Construction of the inner-class object requires the reference to the enclosing class object and compiler will complain if it cannot access it (rare case I hope we will see).
