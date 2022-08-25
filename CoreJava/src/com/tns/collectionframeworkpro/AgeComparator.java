package com.tns.collectionframeworkpro;

import java.util.Comparator;

abstract class AgeComparator implements Comparator<Employee1> {

	public int compare(Employee1 emp1, Employee1 emp2) {

	

		int emp1Age = ((Employee1) emp1).getAge();
		int emp2Age = ((Employee1) emp2).getAge();

		if (emp1Age > emp2Age)
			return 1;

		else if (emp1Age < emp2Age)
			return -1;

		else
			return 0;
	}
}