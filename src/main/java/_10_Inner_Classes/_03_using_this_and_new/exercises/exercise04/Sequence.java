package _10_Inner_Classes._03_using_this_and_new.exercises.exercise04;

interface Selector {

    boolean end();

    int current();

    Object next();
}

public class Sequence {

    private Object[] items;
    private int current = 0;
    private int sequenceSize;

    public Sequence(int sequenceSize) {
        this.sequenceSize = sequenceSize;
        items = new Object[this.sequenceSize];
    }

    public void add(Object objectToAdd) {
        if (current <= sequenceSize) {
            items[current++] = objectToAdd;
        }
    }

    public class SequenceSelector implements Selector {

        private int current = 0;

        public boolean end() {
            return current >= sequenceSize;
        }

        public int current() {
            return current;
        }

        public Object next() {
            if (!end()) {
                return items[current++];
            }
            return null;
        }

        public Sequence sequence() {
            return Sequence.this;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        int i = 0;
        do {
            sequence.add(Integer.toString(i));
            i++;
        } while (i < 5);
        SequenceSelector sequenceSelector = sequence.new SequenceSelector();
        while (!sequenceSelector.end()) {
            System.out.println(sequenceSelector.next());
        }
        System.out.println(sequenceSelector.sequence());
    }

}
