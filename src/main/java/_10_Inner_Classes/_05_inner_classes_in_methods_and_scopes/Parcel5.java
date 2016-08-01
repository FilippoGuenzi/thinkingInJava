package _10_Inner_Classes._05_inner_classes_in_methods_and_scopes;

public class Parcel5 {

    public Destination destination(String s) {
        class PDestination implements Destination {

            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Angola");
    }

}
