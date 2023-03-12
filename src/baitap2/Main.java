package baitap2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D();
        System.out.println(p2d);

        System.out.println(Arrays.toString(p2d.getxy()));
        Point3D p3d = new Point3D();
        System.out.println(p3d);
        System.out.println(Arrays.toString(p3d.getxyz()));

    }
}
