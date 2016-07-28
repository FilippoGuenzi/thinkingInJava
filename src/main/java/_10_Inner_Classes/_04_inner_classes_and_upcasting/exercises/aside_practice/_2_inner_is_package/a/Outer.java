package _10_Inner_Classes._04_inner_classes_and_upcasting.exercises.aside_practice._2_inner_is_package.a;

public class Outer {

    public Inner inner() {
        return new Inner(5l);
    }

    class Inner {

        public int i;
        protected int j;
        int k;
        private int l;

        public Inner(int i) {}
        protected Inner(String s) {}
        Inner(boolean b) {}
        private Inner(long l) {}

        public void pu() {}
        protected void pro() {}
        void pa() {}
        private void pri() {}
    }

    public static void main(String[] args) {
        new Outer();
        new Outer().new Inner(5l);
        new Outer().new Inner(5l).pri();
    }

}
