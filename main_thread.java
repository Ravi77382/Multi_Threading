package multi_threading;
public class main_thread 
{
	public static void main(String[] args) 
	{
		thread1 obj= new thread1();
		thread2 obj1=new thread2();
		obj.start();
		obj1.start();
	}
}