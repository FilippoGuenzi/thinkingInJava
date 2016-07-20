package _10_Inner_Classes._02_the_link_to_the_outer_class.exercise02;

import _10_Inner_Classes._02_the_link_to_the_outer_class.Selector;
import _10_Inner_Classes._02_the_link_to_the_outer_class.Sequence;

public class StringWrapper {

    private String s;

    public StringWrapper(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(5);
        s.add(new StringWrapper("abc"));
        s.add(new StringWrapper("bcd"));
        s.add(new StringWrapper("cde"));
        s.add(new StringWrapper("def"));
        s.add(new StringWrapper("efg"));
        Selector sel = s.selector();
        while (!sel.end()) {
            System.out.println(sel.current());
            sel.next();
        }

    }
}
