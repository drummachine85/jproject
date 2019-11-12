package edu.jcourse.lesson2.datatypes.Lesson5;

public class Constanti {
    private float radius;
    private final float PI=3.14F;
    private final int MY_CONSTANT=10;
    public float area(){
        return PI*(radius*radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPI() {
        return PI;
    }
}
