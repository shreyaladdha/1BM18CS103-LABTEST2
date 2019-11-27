interface safe_driving
{
    int safe_speed=100;
    void speedofvehicle();
}

import java.util.*;
class driver implements safe_driving
{
    static int speed;
    Scanner sc=new Scanner(System.in);
    public void speedofvehicle()
    {
       System.out.println("Enter speed of vehicle");
       speed=sc.nextInt();
    }
    public static void main(String args[])
    {
        driver d= new driver();
        d.speedofvehicle();
        if(speed>safe_speed)
        System.out.println("drive slow");
        if(speed<=safe_speed)
        System.out.println("safe drive");
    }
}