package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.junit.Test;

public class ListTest 
{
	@Test
	public void arraylistexamples()
	{
		List<Integer>list=new ArrayList<Integer>();	
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		list.add(4, 20);
		System.out.println(list);
		list.set(9,30 )	;
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println("Printing values using for loop");
		for(int j=0;j<list.size();j++)
		{
			System.out.println(list.get(j));
		}
			
		System.out.println("Printing values using for each loop");
		for(int L:list)
			System.out.println(L);
		System.out.println("Printing values using Iterator");
		Iterator<Integer>ele=list.iterator();
		while(ele.hasNext())
		{
			System.out.println(ele.next());
		}
	}	
	
	@Test
public void linkedlistexamples()
{
	List<Integer>list=new LinkedList<Integer>();	
	for(int i=0;i<=5;i++)
	{
		list.add(i);
	}
	System.out.println(list);
	
	list.add(4, 20);
	System.out.println(list);
	list.set(9,30 )	;
	System.out.println(list);
	list.remove(5);
	System.out.println(list);
	System.out.println("Printing values using for loop");
	for(int j=0;j<list.size();j++)
	{
		System.out.println(list.get(j));
	}
		
	System.out.println("Printing values using for each loop");
	for(int L:list)
		System.out.println(L);
	System.out.println("Printing values using Iterator");
	Iterator<Integer>ele=list.iterator();
	while(ele.hasNext())
	{
		System.out.println(ele.next());
	}
}	
	
	@Test
public void Vectorexamples()
{
	List<Integer>list=new Vector<Integer>();	
	for(int i=0;i<=10;i++)
	{
		list.add(i);
	}
	System.out.println(list);
	
	list.add(4, 20);
	System.out.println(list);
	list.set(9,30 )	;
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	System.out.println("Printing values using for loop");
	for(int j=0;j<list.size();j++)
	{
		System.out.println(list.get(j));
	}
		
	System.out.println("Printing values using for each loop");
	for(int L:list)
		System.out.println(L);
	System.out.println("Printing values using Iterator");
	Iterator<Integer>ele=list.iterator();
	while(ele.hasNext())
	{
		System.out.println(ele.next());
	}
}	
	
	@Test
public void Stackexamples()
{
	Stack<Integer>list=new Stack<Integer>();	
	for(int i=0;i<=10;i++)
	{
		list.push(i);
	}
	System.out.println(list);
	
	list.push(20);
	System.out.println(list);
	int n = list.peek();
	System.out.println("peek value:" + n);
	System.out.println(list);
	list.pop();
	System.out.println(list);
	System.out.println("Printing values using for loop");
	for(int j=0;j<list.size();j++)
	{
		System.out.println(list.get(j));
	}
		
	System.out.println("Printing values using for each loop");
	for(int L:list)
		System.out.println(L);
	System.out.println("Printing values using Iterator");
	Iterator<Integer>ele=list.iterator();
	while(ele.hasNext())
	{
		System.out.println(ele.next());
	}
}	
}


