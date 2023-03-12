package baitap2;

public class Point3D extends Point2D{
    private float z = 5;
    public Point3D(){

    }

    public Point3D(float x) {
        this.x = x;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }
    public float[] setxyz(){
        return new float[]{super.x,super.y,z};
    }
    public float[] getxyz(){
        return new float[]{super.x,super.y,z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
