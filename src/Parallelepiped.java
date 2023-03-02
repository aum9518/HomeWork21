public class Parallelepiped implements FindCapacity{
    private double height;
    private double length;
    private double width;

    public Parallelepiped() {
    }

    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double findSquare() {
        double result = 2*((height*length)+(length*width)+(height*width));
        return result;
    }

    @Override
    public double findCapacity() {
        double result = length*width*height;
        return result;
    }

    @Override
    public double findSquareCylinder() {
        return 0;
    }

    @Override
    public double findCapacityCylinder() {
        return 0;
    }

}
