interface iqueue
{
    void enqueue(int item);
    int dequeue();
    int display();
}

class dynamicqueue implements iqueue
{
    int queue[],f,r;
    dynamicqueue()
    {
    }
    dynamicqueue(int size)
    {
        queue=new int[size];
        r=-1;
        f=0;
    }
    public void enqueue(int item)
    {
        if(r==queue.length-1)
        {
            int temp[]=new int[queue.length*2];
            for(int i=0;i<queue.length;i++)
            temp[i]=queue[i];
            queue=temp;
            queue[++r]=item;
        }
        else
        queue[++r]=item;
    }
    public int dequeue()
    {
        return (queue[f++]);
    }
    public int display()
    {
        if(f==-1)
        {
         System.out.println("QUEUE IS EMPTY");
         return 0;
        }
        else 
        return 1;
    }
}

import java.util.*;
class queuetest 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of queue");
        int x=sc.nextInt();
        dynamicqueue d=new dynamicqueue(x);
        System.out.println("Enter -1 to end");
        for(;;)
        {
            System.out.println("1.enqueue");
            System.out.println("2.dequeue");
            int n=sc.nextInt();
            if(n==-1)
            System.exit(0);
            switch(n)
            {
                case 1:
                System.out.print("Enter data:");
                int ele=sc.nextInt();
                d.enqueue(ele);
                break;
                case 2:
                if(d.display()==1)
                System.out.println("Element deleted: "+d.dequeue());
                else
                d.display();
                break;
            }
        }
        }
    }
        
        