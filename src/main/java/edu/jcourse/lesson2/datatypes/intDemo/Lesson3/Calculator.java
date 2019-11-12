package edu.jcourse.lesson2.datatypes.intDemo.Lesson3;

public class Calculator {
    public static void main(String[] args) {
        //        0  1  2
        //        10 + 20
        if (args.length != 0) {
            double value1 = Double.parseDouble(args[0]);
            Double.parseDouble(args[2]);
            String operator = args[1];
            double value2 = Double.parseDouble(args[2]);
            double result = 0;
            switch ((operator)) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "/":
                    result = value1 / value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                default:
                    System.out.println("Incorrect format: For example:10+20");

//            System.out.println("Result: " + value1 + " " + operator + value2);
                    System.out.println("Result: " + result);
//                    int i=0;
//                    int a=0;
//                    int b=20;
//                    a+=b;
//                    System.out.println(a);


            }


        }

    }}
