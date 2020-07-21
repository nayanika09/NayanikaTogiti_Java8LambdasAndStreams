package epam.Java8StreamsAndLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class StaticMethodReferenceExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter size of list : ");
		int size;
		size = scanner.nextInt();
		System.out.println("Enter "+size + " list of strings: ");
		for(int i=1;i<=size;i++) {
			list.add(scanner.next());
		}
		List <String>palindromesList= StaticMethodReferenceExample.filterList(list, StringPredicate::isPalindrome);
		System.out.println(palindromesList);
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch");
		}
	  }

	public static List<String> filterList(List<String> list, Predicate<String> predicate) {
		List <String>palindromeList = new ArrayList<>();

		for (String str : list) {
		  if (predicate.test(str)) {
		  palindromeList.add(str);
		  }
		}
		return palindromeList;
	  }
		
		  
	  }
	  



