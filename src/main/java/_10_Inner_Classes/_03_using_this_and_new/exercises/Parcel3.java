package _10_Inner_Classes._03_using_this_and_new.exercises;

public class Parcel3 {

    public class Contents {

        private int i;

        public int getI() {
            return i;
        }

        public Contents() {
            System.out.println("contents prepared");
        }
    }

    public class Destination {

        private String label;

        public String getLabel() {
            return label;
        }

        public Destination(String label) {
            this.label = label;
            System.out.println("destination accepted");
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel = new Parcel3();
        parcel.new Contents();
        parcel.new Destination("Magyarska");
    }
}
