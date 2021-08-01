package constructortest;

public class TestConstructor1 
{
	public TestConstructor1() 
	{
		
		System.out.println("Constructor with no parameters");
	}
	public TestConstructor1(String abc) 
	{
		System.out.println("Constructor with String parameters"+abc);
	}
	public TestConstructor1(String XYZ, int a) 
	{
		System.out.println("Constructor with two parameters"+XYZ+ ", " + a);
	}	
}


