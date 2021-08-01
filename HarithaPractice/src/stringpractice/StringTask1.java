package stringpractice;

import java.util.ArrayList;
import java.util.List;

public class StringTask1 {

	public static void main(String[] args) 
	{
		String str="Haritha hello how are you?how is your weekend?how is your health?are you going to shopping?";
		char[] chArr={'h','a','k','b','m'};
		
		//print the words which contains atleast 2characters of chArr
		List<String>S=new ArrayList<String>();
		
		String arr1[]=str.split(" ");
		for(int i=0;i<arr1.length;i++)
		{               
			if(getNumberOfCharactersInString(arr1[i],chArr)>=2)
			{
				System.out.println(arr1[i]);
			}
		}
			
		
		
	}

	private static int getNumberOfCharactersInString(String word, char[] chArr)
	{
		int count=0;
		for(int j=0;j<chArr.length;j++)
			if(word.contains(String.valueOf(chArr[j])))
			{
				count=count+1;
			}
		return count;
	}

}
