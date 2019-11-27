import java.util.*;
class student extends Exception
{
    String x;
    student()
    {
    }
    student(String ex)
    {
        x=ex;
    }
    public String toString()
    {
        return("marks cannot be :"+x);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String usn,name;
        int m1,m2,m3;
        try
        {
           //usn=String.parseString(args[0]);
           //name=String.parseString(args[1]);
           m1=Integer.parseInt(args[2]);
           m2=Integer.parseInt(args[3]);
           m3=Integer.parseInt(args[4]);
           if((m1<0)||(m2<0)||(m3<0))
           throw new student("negative");
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println("noargs");
        }
        catch(student me)
        {
            System.out.println(me);
        }
    }
}
          