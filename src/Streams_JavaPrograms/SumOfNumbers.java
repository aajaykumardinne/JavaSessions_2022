package Streams_JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String aajay[]) {

		//top-casting: child class object can be refered by parent interface reference name.
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(25, 6, 18, 125, 70, 10, 6));

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println("sum of numbers : " + sum.get());

	}

}
