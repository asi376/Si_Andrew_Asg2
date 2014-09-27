package comparisonObjects;

import java.util.*;


public class StringNonCaseSensitiveCompare implements Comparator<String> 
{
	@Override
	public int compare(String obj1, String obj2) 
	{
		return obj1.toLowerCase().compareTo(obj2.toLowerCase());
	}

}
