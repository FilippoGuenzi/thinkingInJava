package _10_Inner_Classes._02_the_link_to_the_outer_class.exercises.exercise03;

public class Outer {

    private String s;

    public Outer(String s) {
        this.s = s;
    }

    public class Inner {

        public String toString() {
            System.out.println(s);
            return s;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer("joy");
        Inner i = o.inner();
        i.toString();
    }
}
