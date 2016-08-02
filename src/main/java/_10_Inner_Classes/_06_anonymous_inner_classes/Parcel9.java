package _10_Inner_Classes._06_anonymous_inner_classes;

public class Parcel9 {

    public Destination destination(final String dest) {
        return new Destination() {

            private String label = dest;

            public String readLabel() {
                return null;
            }
        };

    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Magyarska");
    }
}
