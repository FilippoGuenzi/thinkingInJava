package _10_Inner_Classes._06_anonymous_inner_classes;

public class Parcel10 {

    public Destination destination(final String dest, final float price) {
        return new Destination() {

            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget");
                }
            }
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Praha", 120f);
        System.out.println(d.readLabel());
    }
}
