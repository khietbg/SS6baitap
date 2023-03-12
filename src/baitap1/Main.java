package baitap1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        Circle c1= new Circle("orange",4);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Cylinder cy = new Cylinder();
        System.out.println(cy);
        Cylinder cy1 = new Cylinder("red",8,10);
        System.out.println(cy1.getArea());
        System.out.println(cy1.getVolum());
    }
}
