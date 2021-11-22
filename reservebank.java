public interface reservebank
{
 void money();
}
interface Sbi extends reservebank
{
	void bond();
}
class Sample implements reservebank
{

	public void money() 
	{
		System.out.println("Provide Loans and more services");
		
	}
	public void bond()
	{
		System.out.println("Provide Govt bonds for particular period only");
	}
public static void main(String args[])
{
	
	 Sample s= new Sample();
	   s.money();
	   s.bond();
	
}
}