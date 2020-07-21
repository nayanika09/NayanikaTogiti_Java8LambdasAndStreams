package epam.Java8StreamsAndLambdas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdasDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		try {
		System.out.println("Enter size of list : ");
		int size;
		size = scanner.nextInt();
		System.out.println("Enter "+size + " elements : ");
		for(int i=1;i<=size;i++) {
			list.add(scanner.next());
		}
		
		System.out.println(checkStringPattern(list));
		} catch(InputMismatchException e) {
			System.out.println("Input valid datatype");
		}

	}
	public static List<String> checkStringPattern(List<String> list) {
		List<String> finalList = list.stream().filter(str ->str.startsWith("a") && str.length() == 3).collect(Collectors.toList());
		return finalList;
	}

}
