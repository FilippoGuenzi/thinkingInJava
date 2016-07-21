package _10_Inner_Classes._03_using_this_and_new;

public class DotNew {

    public class Inner {

        public Inner() {
            System.out.println("Inner instantiated");
        }
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        // here you create an inner object of another object from this object ref (its indeed another object : we could have done it from another class but here
        // we're not in an DotNew instance so its ok for
        // the demo).
        Inner inner = dotNew.new Inner();
    }
}
