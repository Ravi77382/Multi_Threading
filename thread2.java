package multi_threading;
public class thread2 extends thread1
{
	public void run()
	{
		 int i=0,num=0;
		 String  primeNumbers=" ";
		 for (i=1;i<=1000;i++)
		 {
			 int counter=0;
			 for(num=i;num>=1;num--)
			 {
				 if(i%num==0)
				 {
					 counter=counter+1;
					 }
			 }
			 if(counter==2)
			 {
				 primeNumbers=primeNumbers+i+ " ";
				 }
		}	
	       System.out.println("\nPrime numbers from 1 to 1000 are :");
	       System.out.println(primeNumbers);
	 }
}