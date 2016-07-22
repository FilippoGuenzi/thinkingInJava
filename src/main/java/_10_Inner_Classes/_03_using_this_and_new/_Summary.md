To get a reference to the outer class from the inner class : OuterClass.this.
(This has nothing to do with static members notation since we have an instance of the Outer class).
You can wonder when it can be useful since inner class has full access to outer class members.
I have to find situations where this can be useful.

If you want to tell another object, whose reference anotherObject you have, to instanciate its inner class Inner, you just say :
anotherObject.new Inner()


