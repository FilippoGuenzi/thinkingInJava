package _10_Inner_Classes._02_the_link_to_the_outer_class;

public class Sequence {

    private Object items[];
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        // here all methods have access to private array items of the outer class. Since the inner class is inside of the outer class it belongs to it and can
        // access everything from the outer class.
        // this is achieved because during the creation of the inner class the reference of the outer class that created it is passed to the inner class that
        // uses it to access its members.
        // here we understand that an object of the inner class can be created only after the creation of an object of the outer class. Unless the inner class
        // is static.
        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Selector selector = sequence.selector();
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }

}
