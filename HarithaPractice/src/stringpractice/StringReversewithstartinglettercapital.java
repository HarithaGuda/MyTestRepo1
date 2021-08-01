package stringpractice;


public class StringReversewithstartinglettercapital {

	public static void main(String[] args) 
	{
		String str="how are you";

		String output=getWordsReverseOfString(str);
		System.out.println(output);
	

	}
	static String getWordsReverseOfString(String input)
	{
		String output=" ";
		String arr[]=input.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			
			String value=arr[i];
			value=String.valueOf(value.charAt(0)).toUpperCase()+value.substring(1);
			output=output+value+" ";
			//output=output.substring(1)+String.valueOf(output.charAt(0)).toUpperCase();;
		}
return output;
	}
}
