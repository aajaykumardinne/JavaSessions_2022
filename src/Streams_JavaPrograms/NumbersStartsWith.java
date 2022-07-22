package Streams_JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWith {

	public static void main(String[] args) {
		
	 // 3,34,389,575,333,999,1000,33,32567
		
		// TOP-CASTING
		List<Integer>	numbers = new ArrayList<>(Arrays.asList( 3,34,-389,575,333,999,-1000,33,32567));

		List<Integer>	numbersStartsWith  = 	numbers.stream()
															.map(e -> String.valueOf(e))
																.filter(e -> e.startsWith("3") || e.startsWith("-"))
																	.map(Integer::valueOf)
																		.collect(Collectors.toList());
		System.out.println(numbersStartsWith);		  
		
	}

}
