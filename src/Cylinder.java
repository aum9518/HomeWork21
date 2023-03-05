public class Cylinder implements FindCapacity{
    private double radius;
    private double height;
    final private double PI = Math.PI;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double findSquare() {
        return 0;
    }

    @Override
    public double findCapacity() {
        return 0;
    }

    @Override
    public double findSquareCylinder() {
        return 2*PI*radius*(height+radius);
    }

    @Override
    public double findCapacityCylinder() {
        return PI*radius*radius*height;
    }
}
