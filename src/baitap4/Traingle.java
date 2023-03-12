package baitap4;

public class Traingle {
    private double a = 1;
    private double b = 1;
    private double c = 1;

    public Traingle() {
    }

    public Traingle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p= getPerimeter();
        return Math.sqrt(p+(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Traingle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
