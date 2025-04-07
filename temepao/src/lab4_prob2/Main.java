package lab4_prob2;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("rosu", 4, 5);
        Circle c1 = new Circle("verde", 2);

        System.out.println(t1.toString());
        System.out.println(c1.toString());

        Form[] forme = new Form[4];
        forme[0] = t1;
        forme[1] = c1;
        forme[2] = new Triangle("albastru", 3, 3);
        forme[3] = new Circle("galben", 1.5f);

        for (Form f : forme) {
            System.out.println(f.toString());
        }

        for (Form f : forme) {
            if (f instanceof Triangle) {
                ((Triangle) f).printTriangleDimensions();
            } else if (f instanceof Circle) {
                ((Circle) f).printCircleDimensions();
            }
        }
    }
}
