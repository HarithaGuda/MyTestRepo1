package stringpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class friendPairs {

	public static void main(String[] args) 
	{
		String friendPairs = "balu-karthik;balu-arun;kiran-balu;karthik-balu;vijay-karthik;karthik-vijay;arun-karthik;karthik-kiran;";
		String searchName = "balu";	
		List<String> output=getFriendsList(friendPairs,searchName);
		System.out.println(output);
	}

	private static List<String> getFriendsList(String friendPairs, String searchName) 
	{
		HashMap<String, String>Ele=new HashMap<String, String>();
	
		String arr1[]=friendPairs.split(";");
		for(int i=0;i<arr1.length;i++)
		{
			String namepair[]=arr1[i].split("-");
			if(Ele.containsKey(namepair[0]))
			{
				String value=Ele.get(namepair[0]);
				value=value+"-"+namepair[1];
				Ele.put(namepair[0], value);
			}
			else
			{
				Ele.put(namepair[0], namepair[1]);
			}
			if(Ele.containsKey(namepair[1]))
			{
				String value=Ele.get(namepair[1]);
				value=value+"-"+namepair[0];
				Ele.put(namepair[1], value);
			}
			else
			{
				Ele.put(namepair[1], namepair[0]);
			}
		}
		String obj=Ele.get(searchName);
		String OP[]=obj.split("-");
		List<String>result=new ArrayList<String>();
		for(String name:OP)
		{
			result.add(name);
		}
		
		return result;
	}

}
