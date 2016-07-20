package _10_Inner_Classes._01_creating_inner_classes;

public class Parcel2 {

    class Contents {

        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    // to return a reference of inner classes
    public Destination to(String whereTo) {
        return new Destination(whereTo);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        // The instanciation of the inner class needs the existence of an outer instance instanciating it.
        // Here it is the case since where not in a static method : we're in an instance.
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("anywhere");
        // doing the same :
        Parcel2 q = new Parcel2();
        Contents c = q.contents();
        Destination d = q.to("anywhere");
    }
}
