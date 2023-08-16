package multi_threading;
public class thread1 extends Thread
{
	public void run()
	{
		int n,count=0,a,b,c,sum=0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i=1;i<=1000;i++)
        {
            n=i;
            while(n>0)
            {
                b=n%10;
                sum=sum+(b*b*b);
                n=n/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
            sum=0;
        }
	}
}