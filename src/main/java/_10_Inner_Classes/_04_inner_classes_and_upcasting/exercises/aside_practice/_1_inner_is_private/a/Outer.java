package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.a;

import _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._1_inner_is_private.Interface;

public class Outer {

    public Inner inner() {
        return new Inner(5l);
    }

    private class Inner implements Interface{

        public int i;
        protected int j;
        int k;
        private int l;

        public Inner(int i) {}
        protected Inner(String s) {}
        Inner(boolean b) {}
        private Inner(long l) {}

        public void pub() {}
        protected void pro() {}
        void pac() {}
        private void pri() {}
    }

    public static void main(String[] args) {
        new Outer();
        new Outer().new Inner(5l);
        new Outer().new Inner(5l).pri();
    }

}
