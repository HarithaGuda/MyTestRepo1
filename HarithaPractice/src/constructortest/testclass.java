package constructortest;

public class testclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	MySingleton obj1= MySingleton.getInstance();
	obj1.x=obj1.x+5;
	MySingleton obj2= MySingleton.getInstance();
	obj2.x=obj2.x+5;
	MySingleton obj3= MySingleton.getInstance();
	obj3.x=obj3.x+5;
	MySingleton obj4= MySingleton.getInstance();
	obj4.x=obj4.x+5;
	System.out.println(obj4.x);
	}

}
