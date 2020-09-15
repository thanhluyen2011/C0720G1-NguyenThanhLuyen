package access_modifier_05.bai_tap;

import java.util.Arrays;

public class Point2D {
    private float x ;
    private float y;
    public Point2D () {
    }
    public Point2D (float x,float y) {
        this.x= x;
        this.y=y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x, float y) {
        this.x=getX();
        this.y= getY();
    }
    public float [] getXY () {
        float [] array = new float[2];
        array[0]=getX();
        array[1]=getY();
        return array;
    }
}
class Point3D extends Point2D{
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public Point3D(){}
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z = z;
    }
    public void setXYZ (float x, float y,float z) {
        super.getXY();
        this.z = getZ();
    }
    public float [] getXYZ () {
        float [] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }
}
class TestPoint2DAnd3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}