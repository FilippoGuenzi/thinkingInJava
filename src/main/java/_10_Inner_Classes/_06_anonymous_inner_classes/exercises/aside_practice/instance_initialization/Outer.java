package _10_Inner_Classes._06_anonymous_inner_classes.exercises.aside_practice.instance_initialization;

public class Outer {

    public Triangle getTriangle(final double pa, final double pb, final double pgamma) {
        return new Triangle() {

            private double a;
            private double b;
            private double c;
            private double alpha;
            private double beta;
            private double gamma;
            // instance initialization
            {
                a = pa;
            }
            {
                b = pb;
            }
            {
                gamma = pgamma;
            }

            public void m() {}

            {
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(Math.PI - gamma));
            }
            {
                alpha = Math.PI - Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (2 * b * c));
            }
            {
                beta = Math.PI - Math.acos((Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (2 * a * c));
            }
            {
            }

            public double getA() {
                return a;
            }

            public double getB() {
                return b;
            }

            public double getC() {
                return c;
            }

            public double getAlpha() {
                return alpha;
            }

            public double getBeta() {
                return beta;
            }

            public double getGamma() {
                return gamma;
            }

            public double getSurface() {
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        int a = 1;
        int b = 1;
        double gamma = Math.PI / 3;

        Triangle triangle = outer.getTriangle(a, b, gamma);
        double c = triangle.getC();
        double alpha = triangle.getAlpha();
        double beta = triangle.getBeta();

        System.out.println("c² = a²+b²+2ab x cos(Pi-gamma) : " + Math.pow(c, 2) + " = "
                + (Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(Math.PI - gamma)));

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        System.out.println("alpha : " + alpha);
        System.out.println("beta : " + beta);
        System.out.println("gamma : " + gamma);
    }
}
