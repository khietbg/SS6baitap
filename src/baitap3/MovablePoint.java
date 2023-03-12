package baitap3;

public class MovablePoint extends Point{
    private float xs;
    private float ys;
    public MovablePoint(){

    }

    public MovablePoint(float xs, float ys) {
        this.xs = xs;
        this.ys = ys;
    }

    public MovablePoint(float x, float y, float xs, float ys) {
        super(x, y);
        this.xs = xs;
        this.ys = ys;
    }

    public float getXs() {
        return xs;
    }

    public void setXs(float xs) {
        this.xs = xs;
    }

    public float getYs() {
        return ys;
    }

    public void setYs(float ys) {
        this.ys = ys;
    }
    public void setSpeed(float xs, float ys){
     float speed[] = {xs,ys};
    }
    public float[] getSpeed(){
        return new float[]{xs,ys};
    }

    public MovablePoint move(){
        float newXPoint = getX() + xs;
        float newYPoint = getY() + ys;
        setX(newXPoint);
        setY(newYPoint);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xs=" + xs +
                ", ys=" + ys +
                "} " + super.toString();
    }
}
