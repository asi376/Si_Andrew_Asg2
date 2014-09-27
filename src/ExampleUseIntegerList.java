import comparisonObjects.IntegerCompare;

import dList.DLinkList;
import dList.DLinkListIterator;


public class ExampleUseIntegerList {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("=========== add Front ============");
		DLinkList<Integer> storage = new DLinkList<Integer>();
		storage.addToFront(5);
		storage.addToFront(6);
		storage.print();

		System.out.println("=========== add End =============");
		storage.addToEnd(1);
		storage.addToEnd(2);
		storage.print();

		System.out.println("=========== get ================");
		try
		{
			for(int index=0; index < storage.getSize(); index++)
				System.out.println(storage.get(index));
		}
		catch(Exception ex) {}

		
		System.out.println("=========== removeAt ============");
		try
		{
			storage.removeAt(0);
			storage.removeAt(1);
			storage.print();
		}
		catch(Exception ex) {}
		//Create a list where all elements are always inserted sorted
		DLinkList<Integer> list = new DLinkList<Integer>();
		int[] nums = { 5 , 1 , 4, 2, 0, 3, 7 };
		IntegerCompare comparator = new IntegerCompare();
		System.out.println("=========== Sorted Add ===========");
		for(int count=0; count <  nums.length ; count++)
		{
			list.addSorted(nums[count], comparator);
			list.print();
		}

		System.out.println("=========== Iterator ============");
		//Gets an iterator to the start of the list
		DLinkListIterator<Integer> iter = list.getStartIterator();

		//moves the iterator to the end of the list
		do
			System.out.print("["+iter.getdata()+"]");
		while(iter.moveToNext());

		System.out.println();	

		//moves the iterator now from the end of the list to the start of the list
		do
			System.out.print("["+iter.getdata()+"]");
		while(iter.moveToPrev());
		System.out.println();	
	}
}
