package edu.jcourse.lesson2.datatypes.intDemo;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("B is: "+b);
        b=true;
        System.out.println("B is: "+b);
        int a=10;
        int ib=9;

        if(a>ib)
        {
            System.out.println("executed");
    }
        b=true;
        if(b){
            System.out.println("Not executed");
        }
        System.out.println("10>9 "+(10>9));
    }
}
