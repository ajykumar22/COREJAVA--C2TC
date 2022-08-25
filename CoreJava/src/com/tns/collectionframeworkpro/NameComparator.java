package com.tns.collectionframeworkpro;

import java.util.Comparator;

class NameComparator implements Comparator<Employee1>
{

	@Override
	public int compare(Employee1 emp1,Employee1 emp2) {
		String emp1Name = ((Employee1) emp1).getName();
		String emp2Name = ((Employee1) emp2).getName();
//comparing Strings
		return emp1Name.compareTo(emp2Name);
		

	}
	
}