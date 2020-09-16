package access_modifier_05.bai_tap;

import java.util.Arrays;

public class Point {
    public float x;
    public float y;
    public Point () {
    }
    public Point (float x,float y) {
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
    public String toString(){
        return getX() + "x\t" +
                getY() +  "y";
    }
}
class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){}
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    private void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = getXSpeed();
        this.ySpeed = getYSpeed();
    }
    private float[] getSpeed(){
        float[] array = new float[2];
        array[0] = getXSpeed();
        array[1] = getYSpeed();
        return array;
    }
    public String toString(){
        return super.toString() +"\t" +
                xSpeed + "xSpeed \t" +
                ySpeed + "ySpeed \t" +
                Arrays.toString(getSpeed()) + "getSpeed";
    }
    public float[] move(){
        this.x += getXSpeed();
        this.y += getYSpeed();
        return getXY();
    }
}
class Test{
    public static void main(String[] args) {
        Point point = new Point(1,2);
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,3);
        System.out.println(point.toString());
        System.out.println(moveablePoint.toString());
        System.out.println(Arrays.toString(moveablePoint.move()));
    }
}