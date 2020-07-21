package epam.Java8StreamsAndLambdas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamsDemo {

	public static void main(String[] args) {
		double avg;
		List <Integer>intlist= new ArrayList();
		int n;
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		System.out.println("Enter list size : ");
		try {
			n = scanner.nextInt();
			System.out.println("Enter "+n+" integer values : ");
		for(int i = 0;i < n; i++) {
			intlist.add(scanner.nextInt());
		}
		
		int[] intArray = intlist.stream()
									.mapToInt(Integer::intValue)
									.toArray();

		
		avg = computeAverage(intArray);
		System.out.println("Average of the given list of integers is : "+avg);
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter an integer value!");
		}
	}
	public static double computeAverage(int list[]) {
		IntStream intstream = IntStream.of(list);
		OptionalDouble avg = intstream.average();
		if(avg.isPresent()) {
			return avg.getAsDouble();
		}
		return -1;
	}

}
