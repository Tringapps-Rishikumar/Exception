package org.example;

import java.util.*;
class Cardmain implements Cloneable{
    public static void main(String [] args)throws CloneNotSupportedException
    {
        Cardmain card1=new Cardmain();
        if(card1.cardnumber().equals("true"))
        {
            System.out.println("card with same number");
        }
        else {
            System.out.println("the card with diferent number");
        }
        Cardmain card2=(Cardmain)card1.clone();
        System.out.println("\n Holders name "+card2.holdername);
        System.out.println("\n  Card Number "+card2.cardnumber);
        System.out.println("\n Expiration Date "+card2.expirationdate);

    }
    String holdername,cardnumber,expirationdate;
    String name="aa";
    String number="1248";
    String date="12";

    public Cardmain(){
        System.out.println("\n enter the Holders name,Card Number and Expiration Date :");
        Scanner sc=new Scanner(System.in);
        holdername=sc.next();
        cardnumber=sc.next();
        expirationdate=sc.next();
    }
    String cardnumber(){
        if(cardnumber.equals(number)){
            return "true";
        }
        else{
            return "false";
        }
    }
    public Object clone()
    {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}