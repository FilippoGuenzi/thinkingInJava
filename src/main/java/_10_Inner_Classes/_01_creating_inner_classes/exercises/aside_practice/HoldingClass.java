package _10_Inner_Classes._01_creating_inner_classes.exercises.aside_practice;

public class HoldingClass {

    private static final int SF = 1;
    private static int b = 2;
    private final int c = 3;
    private int i = 4;
    public int p = 5;

    static {
        InnerClass a = new InnerClass();
    }

    static class InnerClass {

        public void jojo() {
            b = 1;
        }
    }

    class InnerClass2{
        private int p = 1;
    }

    public void jojo() {
        InnerClass2 iC = new InnerClass2();
    }

    public static void jaja(){
        InnerClass iC = new InnerClass();

    }
}
