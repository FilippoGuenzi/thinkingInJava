package _10_Inner_Classes._06_anonymous_inner_classes;

abstract class Base {

    public Base(int i) {
        System.out.println("Base constructor, i : " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {

    public static Base getBase(int i){
        return new Base(i){
            {
                System.out.println("inside instance initializer");
            }
            public void f() {
                System.out.println("in anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = AnonymousConstructor.getBase(32);
        base.f();
    }

}
