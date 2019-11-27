package databank;
 
public abstract class accounts
{
    public int balance,accountNumber;
    public String accountholdername, address;
    public accounts()
    {
        balance=0;
    }
    public accounts(int bal,int acno,String name,String add)
    {
        balance=bal;
        accountNumber=acno;
        accountholdername=name;
        address=add;
    }
    public abstract void withdrawl();
    public abstract void deposit();
    public void display()
    {
        System.out.println("BALANCE= "+balance);
    }
}

package savings;
import java.util.*;
import databank.*;
public class savingsAccount extends accounts
{
    int rateofInt,wd,dep;
    Scanner sc=new Scanner(System.in);
    public savingsAccount(int bal,int acno,String name,String add)
    {
        super(bal,acno,name,add);
    }
    public void withdrawl()
    {
        System.out.println("Enter amount to withdraw");
        wd=sc.nextInt();
        balance=balance-wd;
    }
    public void deposit()
    {
       System.out.println("Enter deposit amount");
       dep=sc.nextInt();
       balance=balance+dep;
    }
    public void calculateAmount()
    {
        System.out.println("Enter rate of interest");
        rateofInt=sc.nextInt();
        balance=balance+((balance*1*rateofInt)/100);
    }
     public void display()
    {
        System.out.println("rate of interest: "+rateofInt);
        System.out.println("new balance: "+balance);
        System.out.println("account number: "+accountNumber);
        System.out.println("Account holder name: "+accountholdername);
        System.out.println("Adress: "+address);
    }
}
 

import savings.savingsAccount;
import java.util.*;

class employee
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter balance");
        int x=sc.nextInt();
        System.out.println("Enter Account number");
        int ac=sc.nextInt();
        System.out.println("Enter Account holder name");
        String n=sc.nextLine();
        System.out.println("Enter Address");
        String ad=sc.nextLine();
        savingsAccount s=new savingsAccount(x,ac,n,ad);
        s.withdrawl();
        s.deposit();
        s.calculateAmount();
        s.display();
    }
}
        