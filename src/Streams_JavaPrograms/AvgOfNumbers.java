package Streams_JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,7,8,0,45,-8);
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("avg is: " + avg);
		
	}

}
