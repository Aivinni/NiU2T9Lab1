public class RightTriangle {
    private double base;
    private double height;
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse() {
        return Math.hypot(base, height);
    }
}
