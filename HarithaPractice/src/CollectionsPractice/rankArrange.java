package CollectionsPractice;

import java.util.ArrayList;


public class rankArrange {

	public static void main(String[] args) {
		String baseScoreString = "A-1,B-2,C-3,D-4,E-5,F-6";
		String newElement = "Z-1";
		ArrayList<String> output=getScoredStringAfterInsert(baseScoreString,newElement);
		System.out.println(output);

	}

	private static ArrayList<String> getScoredStringAfterInsert(String baseScoreString, String newElement)
	{
		ArrayList<String>Ele=new ArrayList<String>();
		String arr1[]=baseScoreString.split(",");
		for(int i=0; i<arr1.length;i++)
		{
		Ele.add(arr1[i]);
		}
		return null;
	}

}
