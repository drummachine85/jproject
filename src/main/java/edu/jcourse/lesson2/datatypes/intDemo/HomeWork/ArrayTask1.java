package edu.jcourse.lesson2.datatypes.intDemo.HomeWork;

public class ArrayTask1 {
    public static void main(String[] args) {
        int j;
        int array[]=new int[11];
        System.out.println("Array Task 1:");
          System.out.println("Array initialization :");
            System.out.println(" ");

        for (j = 0; j < 10; j++)
        {
            array[j]=j;
            System.out.println("Number of element: "+j+" "+"Element value: "+ array[j]);
        }

        if(j<10)
        {
            System.out.println("Something wrong!");
            System.out.println("Please check your code in firs cycle for!");
        }

        else
        {
            System.out.println(" ");
              System.out.println("Array decrement :");
                System.out.println(" ");

               for (int k=9; k >=0 ; k--)
                    {
                       --j;
                     System.out.println("Number of element: "+ k +" "+"Element value: "+array[j]);
                    }
            if(j==0)
            {
                System.out.println(" ");
                  System.out.println("Home work is done.");
            }
            else
            {
                System.out.println("Something wrong!");
                  System.out.println("Please check your code!");
            }
        }
  }
}
