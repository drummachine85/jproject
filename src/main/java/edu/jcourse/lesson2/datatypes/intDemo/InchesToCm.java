package edu.jcourse.lesson2.datatypes.intDemo;

public class InchesToCm {
    public static void main(String[] args) {
        float fInches=Float.parseFloat(args[0]);
        double inches=Double.parseDouble(args[0]);
        //double doubleInches=2;
        //double doubleCm=doubleInches*2.54F;
        double cm=inches*2.54F;
        System.out.println("Result with double:"+cm);
    }
}
