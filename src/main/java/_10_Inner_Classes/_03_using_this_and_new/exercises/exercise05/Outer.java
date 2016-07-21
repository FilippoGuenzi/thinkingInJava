package _10_Inner_Classes._03_using_this_and_new.exercises.exercise05;

public class Outer {

    public class Inner {

        public Inner() {
            System.out.println("inner instanciated");
        }
    }

}

class Ext {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.new Inner();
    }
}
