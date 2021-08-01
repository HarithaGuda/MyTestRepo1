package stringpractice;


import java.util.Map;
import java.util.TreeMap;

public class StringTask 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="Balu-20:Haritha-40:Jyothi-20:Lohith-10:Haritha-20:Jyothi-5:Lohith-13:Balu-2:Haritha-3";
		
		Map<String,Integer>M=new TreeMap<String, Integer>();
		String arr[]=str.split(":");
		for(int j=0;j<arr.length;j++) 
		{
			//System.out.println(arr[j]);
			String arr1[]=arr[j].split("-");
			if(M.containsKey(arr1[0]))
			{
				int newValue=M.get(arr1[0])+Integer.valueOf(arr1[1]);
				M.put(arr1[0], newValue);
			}
								
			else
			{
				M.put(arr1[0], Integer.valueOf(arr1[1]));
			}
		}
			System.out.println(M);
		
		}
	       
	}

	




