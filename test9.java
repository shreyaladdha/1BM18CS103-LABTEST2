import java.util.*;
class bank extends Exception
{
    static String x, name;
    static int  acno, balance;
    bank()
    {
        //balance=0;
    }
    bank(String ex)
    {
        x=ex;
    }
    public String toString()
    {
        return("Insufficient "+x);
    }
    void withdrawl(int amt) throws bank
    {
         balance=balance-amt;
         
             if(balance<2000)
             throw new bank("balance");
             else
              System.out.println("balance: "+balance);
           
        }
        void deposit(int amt) throws bank
    {
         balance=balance+amt;
         
             if(balance<2000)
             throw new bank("balance");
             else
              System.out.println("balance: "+balance);
           
        }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter balance");
        balance=sc.nextInt();
        System.out.println("enter 1 to withdraw");
        System.out.println("enter 2 to deposit");
        bank b=new bank();
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            try
            {
            System.out.println("enter amt to withdraw");
            int w=sc.nextInt();
            b.withdrawl(w);
        }
        catch(bank be)
        {
            System.out.println(be);
        }
            break;
            case 2:
            try
           {
               System.out.println("enter amt to deposit");
            int w=sc.nextInt();
            b.deposit(w);
        }
        catch(bank be)
        {
            System.out.println(be);
        }
            break;
            default: System.exit(0);
        }
       }
    }