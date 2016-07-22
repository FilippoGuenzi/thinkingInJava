package _10_Inner_Classes._04_inner_classes_and_upcasting;

class Parcel4 {

    private class InnerContents implements Contents {

        private int i;

        public String readContent() {
            return Integer.toString(i);
        }
    }

    protected class InnerDestination implements Destination {

        private String destination;

        public InnerDestination(String destination) {
            this.destination = destination;
        }

        public String readDestination() {
            return destination;
        }
    }

    public Contents contents() {
        return new InnerContents();
    }

    public Destination destination(String destination) {
        return new InnerDestination(destination);
    }

}

public class TestParcel {

    public static void main(String[] args) {
        Parcel4 parcel = new Parcel4();
        Contents contents = parcel.contents();
        Destination destination = parcel.destination("Tasmania");
        // cannot make the following because of the private access of Inner Classes :
            // Contents contents = parcel.new InnerContents();
            // InnerContents innerContents = (InnerContents) parcel.contents();
        //Can make the following since InnerDestination is accessible from the same package (and from inheritors).
            Destination dest = parcel.new InnerDestination("Romania");
            Parcel4.InnerDestination innerDestination = (Parcel4.InnerDestination) parcel.destination("Bruxelles");
    }
}
