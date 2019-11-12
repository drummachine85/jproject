package edu.jcourse.lesson2.datatypes.intDemo.HomeWork;

public class ArrayTask2 {
    public static void main(String[] args) {
        System.out.println("Array Task 2 :");
           int array[]=new int[10];
             int Summ=0;
               int Quantity=0;
                 int Quantity2=1;
        for (int i = 0; i < 10; i++) {
              array[i]=i;
                Quantity++;
                Quantity2++;
        }
           for (int k = 0; k <10; k++) {
               array[k]=k*7;
            }
        for (int s = 0; s <10; s++) {

            Summ=Summ+array[s];
        }
        System.out.println("The sum of the elements of the array is : "+Summ);
         System.out.println("Quantity is equal: "+Quantity);
          System.out.println("Average amount is : "+Summ/Quantity);
            System.out.println(" ");
             System.out.println("Array Task 2 fully complete!");
    }
}
