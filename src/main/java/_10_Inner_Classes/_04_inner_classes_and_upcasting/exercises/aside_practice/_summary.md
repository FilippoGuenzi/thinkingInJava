A reference of a private inner class can be returned in an external class having no direct access to the inner class through a method of the enclosing class to which the external class has access.
From a class having no access to Inner
*   outer.inner() is allowed when inner delivers a reference of the inner class
*   outer.new Inner() isn't allowed though :
**   not because the constructor is directly called from a place which hasn't access to it
**   but because Inner type is not accessible from there
