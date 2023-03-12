package baitap1;

public class Cylinder extends Circle{
    double height = 8;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return 2*Math.PI*height+2*Math.PI*getRadius()*getRadius();
    }
    public double getVolum(){
        return height*Math.PI*getRadius()*getRadius();
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "color=" + getColor() +
                "radius=" + getRadius() +
                "height=" + height +
                '}';
    }
}
