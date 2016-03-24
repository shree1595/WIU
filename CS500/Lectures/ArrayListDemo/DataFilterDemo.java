/*
 * 
 *  One more complicate example about how to use ArrayList
 *  
 */

import java.util.*;
public class DataFilterDemo {
	ArrayList<Integer> arr = new ArrayList<Integer>();  // declare an arraylist to store all the data
	
	public void addElem(int elem)                      // add element to the arr
	{
		arr.add(elem);
	}
	
	public void removeElem(int elem)                 // remove element to the arr
	{
		arr.remove(elem);
	}
	
	public ArrayList<Integer> getHigherthan(int value)    // return all the elements  larger than value as an arraylist 
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.size(); i++)
		{
			int temp = arr.get(i);
			
			if(temp > value)
				ret.add(temp);			
		}		
		
		return ret;		
	}
	
	public static void main(String[] args)            // test program here
	{
		DataFilterDemo datafilter = new DataFilterDemo();
		datafilter.addElem(11);						  // add the first element as 11
		datafilter.addElem(20);						  // add the second element as 20		
		datafilter.addElem(100);                      // add the third element as 100
		
		ArrayList<Integer> ret = datafilter.getHigherthan(10);     //return all the elements greater than 10
		System.out.println(ret.toString());		
		
		datafilter.removeElem(1);                   //remove the second element in the list 
		ret = datafilter.getHigherthan(10);         //return all the elements greater than 10
		System.out.println(ret.toString());		
	}
	
	
}
