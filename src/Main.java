public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.getInfo());
        circle.setRadius(9.2);
        System.out.println(circle.getInfo());

        RightTriangle triangle1 = new RightTriangle(3, 4);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        double tri1Hypo = triangle1.hypotenuse();
        double tri2Hypo = triangle2.hypotenuse();

        System.out.println(tri1Hypo);
        System.out.println(tri2Hypo);
    }
}
