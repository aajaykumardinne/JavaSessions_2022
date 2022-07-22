package Streams_JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbersList = Arrays.asList(4, 23, 47, 75, 89, 100, 121, 249);
		
		// even numbers
		List<Integer>  evenNumList = numbersList.stream()
													.filter(e -> e%2==0)
														.collect(Collectors.toList());
		System.out.println(evenNumList);
		
		// odd numbers
		List<Integer>	 oddNumList = 	numbersList.stream()
														.filter(e -> e%2!=0)
															.collect(Collectors.toList());
        System.out.println(oddNumList);
	}

}
