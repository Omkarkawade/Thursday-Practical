/*
Write a java program. Create a class Calculation add methods addition subsraction multiplication and division to it.Create objects and access those methods.
*/
class Calculation
{
	int a=50,b=10,result;
	void add()
	{
		result=a+b;
		System.out.println("The Addition of two numbers is "+result);
	}
	void sub()
	{
		
		result=a-b;
		System.out.println("The Substraction of two numbers is "+result);
	}
	void mul()
	{
		
		result=a*b;
		System.out.println("The Multipliction of two numbers is "+result);
	}
	void div()
	
	{
		
		result=a+b;
		System.out.println("The Division of two numbers is "+result);
	}
}
class Calculation1
{
	public static void main(String args[])
	{
		Calculation c1= new Calculation();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}
	
}