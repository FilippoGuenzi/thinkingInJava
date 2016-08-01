(Anonymous inner classes cannot have constructors)

Classes declared inside the scope of a method are called local inner classes.

They cannot be accessed outside of the method scope :
- the type cannot be accessed outside of the method scope and therefore :
    - you cannot declare variables of this type outside of the method
    - you cannot instantiate this type outside of the method
- you can access base class references outside of the method
Local inner classes don't have access qualifiers because their definition scope defines where they're accessible from.

A class can be declared inside a control statement. It is accessible only inside the scope of this statement. It gets created anyway, even if we conditionnally pass by where it is defined.
