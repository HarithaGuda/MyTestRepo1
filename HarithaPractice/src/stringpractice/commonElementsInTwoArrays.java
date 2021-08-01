package stringpractice;

import java.util.HashSet;
import java.util.Set;

public class commonElementsInTwoArrays {

	public static void main(String[] args) 
	{
		int []arr1 = {1,2,4,5,3,3};
		int []arr2 = {4,5,6,2,7,7,1};
		getCommonElementsInArray(arr1, arr2);
		
				
	}
	static int [] getCommonElementsInArray(int[] arr1,int []arr2)
	{
		Set<Integer> commonElements = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			commonElements.add(arr1[i]);
		}

		for(int e:commonElements)
		{
			boolean isFound = false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j]==e)
				{
					isFound=true;
				}
			}
			if(isFound==false)
			{
				commonElements.remove(e);
			}
		}
		int result[]=new int[commonElements.size()];
		int count=0;
		for(int k:commonElements)
		{
			result[count]=k;
			count=count+1;
		}
	

		return result ;
		
	}
}




