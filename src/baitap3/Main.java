package baitap3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Point p = new Point();
//        System.out.println(p);
//        System.out.println(Arrays.toString(p.getxy()));
//        Point p1 = new Point(3,8);
//        System.out.println(p1);
//        System.out.println(Arrays.toString(p.getxy()));
        MovablePoint m = new MovablePoint(5,6,7,8);
        System.out.println(m);
        System.out.println(m.move());

    }
}
