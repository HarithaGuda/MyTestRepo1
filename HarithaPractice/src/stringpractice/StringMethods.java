package stringpractice;

import org.junit.Test;

public class StringMethods {

	@Test
	public void testStringMethiods()
	{
		String str="Haritha Balu";
		int a=str.length();
		System.out.println(a);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			System.out.println(ch);
		}
		String str1=str.substring(4);
		System.out.println(str1);
		String str2=str.substring(2,5);
		System.out.println(str2);
		String str3=str.concat("Haritha");
		System.out.println(str3);
		int k=str.indexOf("Balu");
		System.out.println(k);
		int j=str.indexOf("Ba", 4);
		System.out.println(j);
		Boolean B="Haritha Balu".equals(str);
		System.out.println(B);
		Boolean B1="Haritha Balu".equals("Capgemini");
		System.out.println(B1);
		String str4=str.toLowerCase();
		System.out.println(str4);
		String str5=str.toUpperCase();
		System.out.println(str5);
		String S2="Haritha Balu".replace('a', 'k');
		System.out.println(S2);
		

	}

}
