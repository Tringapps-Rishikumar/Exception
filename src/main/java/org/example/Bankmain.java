package org.example;

import java.util.Scanner;
class user_exc extends Exception{
    void user_exc(String s){

    }
}

public class Bankmain{
    public static void main(String []args) {
        int no;
        String name;

        Scanner bn = new Scanner(System.in);

        System.out.println("*welcome to your bank*");
        System.out.print("Enter your Name:");
        name = bn.next();
        System.out.print("Enter your Account number:");
        no = bn.nextInt();
        Bank bank = new Bank(no,name);
        while(true){

            System.out.println("service provided:");
            System.out.print("\n1)Deposit\n2)Total balance\n3)withdraw\n4)Exit\nEnter your choice:");
            int x = bn.nextInt();
            switch (x) {
                case 1:
                    System.out.println("enter the amount to be deposited:");
                    int dep = bn.nextInt();
                    bank.deposit(dep);
                    break;
                case 2:
                    System.out.println( "Current Balance:"+bank.Current_balance());
                    break;

                case 3:

                    System.out.println("enter the amount to be withdraw:");
                    int dra = bn.nextInt();
                    bank.Withdraw(dra);
                    break;

                case 4:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
        }
    }

}
class Bank{
    int Acc_no;
    String Acc_name;
    int Balance=0;



    public  Bank(int Acc_no,String Acc_name)
    {
        this.Acc_no=Acc_no;
        this.Acc_name=Acc_name;
        System.out.println("Name:"+Acc_name);
        System.out.println("Account number:"+Acc_no);
    }
    public void deposit(int n)
    {
        Balance=Balance+n;
    }

    int Current_balance()
    {

        return Balance;
    }
    public void Withdraw(int n1)
    {
        int n=Current_balance();
        try {
            if(n1>n){
                throw new user_exc();
            }
            else{
                Balance=Balance-n1;
            }
        }
        catch (Exception e)
        {
            System.out.println("you don't have suficient ammount");
        }
    }
}