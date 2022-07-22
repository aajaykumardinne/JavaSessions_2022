package Streams_JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(4, 20, 50,30, 15);

		// 16 400 2500 900 225
		// 2500 900
		// 3400/2 = 1700
		
		double avg = list.stream()
						.map(e -> e * e)
						.filter(e -> e > 500)
						.mapToInt(e -> e)
						.average()
						.getAsDouble();

		System.out.println(avg);

	}

}
