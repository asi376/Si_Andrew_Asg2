package dList;
/**
 * Generic Doubly linked list
 * @author Jordan Kidney
 * @version 1.0
 * 
 * Last Modified: Sept 18, 2014 - Created (Jordan Kidney)
 */
import java.util.Comparator;

import javax.management.RuntimeErrorException;

public class DLinkList<type> 
{
	private DNode<type> start; // will always keep a reference to the first node in the list
	private DNode<type> end;   // will always keep a reference to the last node in the list
	

	/**
	 * default constructor
	 */
	public DLinkList()
	{
		start = end = null;
	}

	/**
	 * gives back the size of the list
	 * @return the number of nodes in the list
	 */
	public int getSize() 
	{ 
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
		return -1; 
	}

	/**
	 * creates an Iterator object that begins at the start of the list
	 * @return the iterator object
	 */
	public DLinkListIterator<type> getStartIterator()
	{
		//DO NOT CHANGE THIS METHOD
		return new DLinkListIterator<type>(start);
	}
	/**
	 * creates an Iterator object that begins at the end of the list
	 * @return the iterator object
	 */
	public DLinkListIterator<type> getEndIterator()
	{
		//DO NOT CHANGE THIS METHOD
		return new DLinkListIterator<type>(end);
	}
	/**
	 * This method will create a new node to contain the data and add it to the
	 * front of the list
	 * @param data the data element to add to the start of the list
	 */
	public void addToFront(type data)
	{
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
	}
	/**
	 * This method will create a new node to contain the data and add it to the end of the list
	 * You should try to do this add in O(1)
	 * @param data the data element to add to the end of the list
	 */
	public void addToEnd(type data)
	{
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
	}

	/**
	 * This method will create a new node to contain the data and add it sorted into the list.
	 * It should apply an insertion sort step to place the node properly in the list. The first node
	 * should be the smallest and the end node should be the largest. Note: This method only
	 * works if all insertions to the list are done using this method rather then the other
	 * add methods. 
	 * @param data the data element to add to the list
	 * @param comparator the compare object used to determine the proper insertion point
	 * @see Comparator
	 */
	public void addSorted(type data, Comparator<type> comparator)
	{
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
	}
	/**
	 * Retrieves the data stored at the given index/node in the list. The first
	 * node is considered to be stored at index 0
	 * @param index the index to get data from
	 * @return the data element stored at the given location if the index is within the bounds
	 * @throws Exception if the index is out of bounds or the list is empty
	 */
	public type get(int index) throws Exception
	{
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
		return null;
	}


	/**
	 * Removes the data stored at the given index/node in the list. The first
	 * node is considered to be stored at index 0. The data and node from this index will be removed.
	 * @param index the index to get data/node to remove
	 * @return the data element stored at the given location if the index is within the bounds
	 * @throws Exception if the index is out of bounds or the list is empty
	 */
	public type removeAt(int index) throws Exception
	{
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
		return null;
	}
	
	/**
	 * Determines if the provided data element is in the list or not
	 * @param other the data element to search for
	 * @param comparator used to do the comparisons 
	 * @return true if at least one match found, false otherwise
	 */
	public boolean contains(type other, Comparator<type>  comparator)
	{
		//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
		throw new RuntimeErrorException(null,"NO CODE"); // remove this line when you start
	}


	/**
	 * Searches for the given value in the list and removes the first instance it finds
	 * @param other the data element to search for
	 * @param comparator used to do the comparisons
	 * @return null if nothing is found, otherwise the data element that was removed
	 */
    public type findAndRemove(type other, Comparator<type>  comparator)
    {
    	//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)   	  	
    	return null;
    }
	
	/**
	 * Searches for the given value in the list and removes all of the instances it finds
	 * @param other the data element to search for
	 * @param comparator used to do the comparisons
	 * @return null if nothing is found, otherwise the data element that was removed
	 */
    public type findAndRemoveAll(type other, Comparator<type>  comparator)
    {
    	//TODO STUDENT MUST IMPLIMENT (REMOVE THIS COMMENT WHEN DONE)
    	return null;
    }
	
	/**
	 * prints the list to console/standard output from the first node to the last node
	 */
	public void print()
	{
		DNode<type> curr = start;

		System.out.print("Start->");

		while(curr != null)
		{
			System.out.print("["+curr.getData()+"]->");
			curr = curr.getNext();
		}

		System.out.println("null");
	}

}
