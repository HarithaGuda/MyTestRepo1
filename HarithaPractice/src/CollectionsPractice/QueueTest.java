package CollectionsPractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {
	
	@Test
	public void PriorityQueueexamples()
	{
		Queue<Integer>Ele=new PriorityQueue<Integer>();
		for(int i=0;i<=10;i++)
		{
			Ele.add(i);
		}
		System.out.println(Ele);
		//Ele.remove();
		//System.out.println(Ele);
		Ele.remove(10);
		System.out.println(Ele);
		Ele.poll();
		System.out.println(Ele);
		int E=Ele.peek();
		System.out.println(E);
		System.out.println("Print using for loop");
		int n = Ele.size();
		for(int j=0;j<n;j++)
		{
			System.out.println(Ele.poll());
		}
		System.out.println("Print using for each loop");
		for(int value:Ele)
		{
			System.out.println(value);
		}
		System.out.println("Print using iterator");
		Iterator<Integer>I=Ele.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
	}
	@Test
	public void ArrayDeQueueexamples()
	{
	Deque<Integer>Ele=new ArrayDeque<Integer>();
	{
	for(int i=0;i<=10;i++)
	{
		Ele.add(i);
	}
	System.out.println(Ele);
	//Ele.remove();
	//System.out.println(Ele);
	Ele.remove(10);
	System.out.println(Ele);
	Ele.poll();
	System.out.println(Ele);
	int E=Ele.peek();
	System.out.println(E);
	System.out.println("Print using for loop");
	int n = Ele.size();
	for(int j=0;j<n;j++)
	{
		System.out.println(Ele.poll());
	}
	System.out.println("Print using for each loop");
	for(int value:Ele)
	{
		System.out.println(value);
	}
	System.out.println("Print using iterator");
	Iterator<Integer>I=Ele.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
}
	

}
}
