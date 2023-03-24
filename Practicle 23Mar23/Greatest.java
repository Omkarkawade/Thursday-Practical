/*
write a program to take 3 numbers and find the greatest of all the 3 numbers.
*/
class Greatest
{
	public static void main(String args[])
	{
		int a=10,b=10,c=5;
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}			
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
		
		
	}
}