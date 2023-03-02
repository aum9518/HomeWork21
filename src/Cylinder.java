public class Cylinder implements FindCapacity{
    private double radius;
    private double height;
    final private double PI = Math.PI;

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
