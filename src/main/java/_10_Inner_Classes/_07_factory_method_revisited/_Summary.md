Factory method : instead of instanciating an object implementing an interface directly with its constructor you delegate this to a factory returning a reference to the object.
If you have to change the implementation of the interface you use the other factory.
With anonymous inner classes the factory is imbedded in the implementation and is a static singleton.
See code examples and exercises.
