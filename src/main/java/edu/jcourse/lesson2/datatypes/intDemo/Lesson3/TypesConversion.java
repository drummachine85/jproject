package edu.jcourse.lesson2.datatypes.intDemo.Lesson3;

public class TypesConversion {
    public static void main(String[] args) {
        byte bVar=10;
        long Ivar=bVar;

        double dVar;
long lVar=10_000;
dVar=lVar;
        System.out.println("lVar and dVar:"+ lVar +" "+dVar);
        double x,y;
        byte b;
        int i;
        char ch;

        x=10.0;
        y=3.0;
        System.out.println("x/y: "+x/y);
        i=(int) (x/y);
       System.out.println("x/y: "+i);
        i=120;
        b=(byte)i;
        System.out.println("b: "+b);
//        b=90;
//        ch=(char)b;
//        System.out.println("char: "+ch);
int iChar=10086;
ch=(char)iChar;
        System.out.println("ch from i: "+ch);
    }
}
