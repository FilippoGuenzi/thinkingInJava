package _10_Inner_Classes._03_using_this_and_new;

public class DotThis {

    public void f() {
        System.out.println("DotThis.f()");
    }

    public Inner inner() {
        return new Inner();
    }

    public class Inner {

        public DotThis dotThis() {
            return DotThis.this;
        }
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.inner();
        inner.dotThis().f();
    }
}
