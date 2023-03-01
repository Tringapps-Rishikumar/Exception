package org.example;

import java.util.Scanner;

class Point implements Cloneable{
    String x;
    String y;
    Point(String x,String y)
    {
        this.x=x;
        this.y=y;
    }

    public Object clone()
    {
        try {
            return  super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean check(String x1,String y1) {
        return x.equals(x1) && y.equals(y1);
    }
}
public class Pointmain{
    public static void main(String []args)throws CloneNotSupportedException
    {
        Scanner bn=new Scanner(System.in);
        System.out.println("enter the 1st co-ordinate:");
        System.out.println("enter the x-coordinate:");
        String x=bn.next();
        System.out.println("enter the y-coordinate:");
        String y=bn.next();
        Point point1=new Point(x,y);
        Point point2=(Point) point1.clone();
        System.out.println("enter the second co-ordinate:");
        System.out.println("enter the x1-coordinate:");
        point2.x= bn.next();
        System.out.println("enter the y-coordinate:");
        point2.y=bn.next();
        String x3=point2.check(x,y)?"both point are same":"both point are not same";
        System.out.println("hence "+x3);
        System.out.println("orginal copy of X and y:"+point1.x+" "+point1.y);
        System.out.println("cloned  copy of X and y:"+point2.x+" "+point2.y);
    }
}