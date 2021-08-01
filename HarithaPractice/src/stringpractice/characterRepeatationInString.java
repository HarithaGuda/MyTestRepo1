package stringpractice;

import java.util.HashMap;
import java.util.TreeMap;

public class characterRepeatationInString {

	public static void main(String[] args) 

	{
		String str="addfgsssdd";
		TreeMap<Character,Integer> output=getAllChactersWithCount(str);
		System.out.println(output);	
	}
	
	public static TreeMap<Character,Integer> getAllChactersWithCount(String input)
	{
		TreeMap<Character,Integer>Ele=new TreeMap<Character, Integer>();
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(Ele.containsKey(ch))
			{
				int count= Ele.get(ch) + 1;
				Ele.put(ch, count);
			}
			else
			{
				Ele.put(ch, 1);
			}
		}
		return Ele;
	}
	
	

}
