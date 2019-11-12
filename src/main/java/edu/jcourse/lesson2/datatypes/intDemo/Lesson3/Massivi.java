package edu.jcourse.lesson2.datatypes.intDemo.Lesson3;

public class Massivi {
    public static void main(String[] args) {
//        int myArray[]=new int[5];
//        myArray[0]=10;
//        myArray[1]=20;
//        myArray[2]=30;
//        System.out.println(myArray[1]);
        int arraySize=10;
        int a[]=new int[arraySize];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
            for(int v: a){
                System.out.println(v);
            }
        }
    }
}
