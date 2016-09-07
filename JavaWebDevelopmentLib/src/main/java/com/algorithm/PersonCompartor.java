package com.algorithm;

import java.util.Comparator;

public class PersonCompartor  implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.age-o2.age;
	}

}
