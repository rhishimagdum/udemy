package com.rhishi.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Sort the array
	// Search the element
	// Return result
@Component
public class BinarySearchImpl {
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println("Sorting Algo" + sortAlgorithm);
		return 3;
	}

}
