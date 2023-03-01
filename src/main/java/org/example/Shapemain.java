package org.example;

import java.util.*;
import java.lang.*;
class my_excp extends Exception{
    void my_excp(String e)
    {

    }
}

public class Shapemain {
    public static void main(String[] args) {
        Scanner bn = new Scanner(System.in);
        while (true) {
            System.out.println("enter the choice:\n 1)validate \n2)exit");
            int ch =bn.nextInt();
            switch(ch) {
                case 1:
                    try {
                        System.out.println("finding in area and perimeter:");
                        System.out.println("enter the choice: \n1.Area \n2.Perimeter");
                        int no = bn.nextInt();
                        if (no > 2) {
                            throw new my_excp();
                        } else {
                            Shape s = new Shape(no);
                        }
                    } catch (Exception e) {
                        System.out.println("enter the valid choice");
                    }
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }
}
class Shape{

    Scanner bn = new Scanner(System.in);
    int  lentri1, lentri2, lentri3, heitri,bretri;
    int lenrect, widrect;
    int radcircle;
    Shape(int choice) {

        if (choice == 1)
        {
            System.out.println("Enter your choice:\n1.Area of rectangle\n2.Area of triangle\n3.Area of circle\n");
            int a = bn.nextInt();
            System.out.println("AREA OF YOUR SHAPE:"+area(a));
        }
        else if(choice == 2)
        {
            System.out.println("Enter your choice :\n1.Perimeter of rectangle\n2.Perimeter of Triangle\n3.Perimeter of Circle\n");
            int b = bn.nextInt();
            System.out.println("PERIMETER OF YOUR SHAPE:"+perimeter(b));
        }

    }
    int perimeter(int shape) {
        if (shape == 1) {
            System.out.println("enter the length and width of Rectangle :");
            lenrect = bn.nextInt();
            widrect = bn.nextInt();
            return (2 * (lenrect + widrect));//p=2(length*width)

        }
        if (shape == 2) {
            System.out.println("enter the length1,length2,length3 of  Triangle");
            lentri1 = bn.nextInt();
            lentri2 = bn.nextInt();
            lentri3 = bn.nextInt();
            return lentri1 * lentri2 * lentri3;//p=length1*length2*length3

        }
        if (shape == 3) {
            System.out.println("Enter the radius of circle");
            radcircle = bn.nextInt();
            return (int) (2 * Math.PI * radcircle);//p=2*pi*r

        }
        else{
            System.out.println("enter valid choice bro");
        }
        return 0;
    }
    int area(int shape) {
        if (shape == 1) {
            System.out.println("Enter the length and width of a Rectangle");
            lenrect = bn.nextInt();
            widrect = bn.nextInt();
            return lenrect * widrect;//a=width*length

        }
        if (shape == 2) {
            System.out.println("Enter the breadth and height of a Triangle");
            bretri = bn.nextInt();
            heitri = bn.nextInt();
            return ((bretri * heitri) / 2);//(height*base)/2

        }
        if (shape == 3) {
            System.out.println("Enter the radius for a circle");
            radcircle = bn.nextInt();
            return ((int) (Math.PI * radcircle * radcircle));//pi*r*r

        }
        return 0;
    }

}