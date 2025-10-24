package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {
	public static void main(String[] args) {
		// 1. Given a list of integers, separate odd and even numbers?
//		 List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//		 Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
//		 Set<Entry<Boolean, List<Integer>>> entrySet = collect.entrySet();
//		 System.out.println(entrySet);
//		 System.out.println(collect);
//		 for(Map.Entry<Boolean, List<Integer>> entry:entrySet) {
//			 System.out.println("key "+entry.getKey());
//			 System.out.println("key "+entry.getValue());
//		 }

		// 2 .How do you remove duplicate elements from a list using Java 8 streams?

//        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
//        List<String> collect = listOfStrings.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);

		// 3 .How do you return duplicate elements from a list using Java 8 streams?
//		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
//		Set<Entry<String, Long>> entrySet = listOfStrings.stream().collect(Collectors.groupingBy(str->str,Collectors.counting())).entrySet();
//		 List<String> collect2 = entrySet.stream().filter(i->i.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
//		 System.out.println(collect2);
//		Set<Entry<String, Long>> entrySet1 = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet();
//		List<Entry<String, Long>> collect = entrySet1.stream().filter(i->i.getValue()>1).collect(Collectors.toList());
//		System.out.println(collect);

		// 3. How do you find frequency of each character in a string using Java 8
		// streams?
//        String inputString = "Java Concept Of The Day";
//       Map<Character, Long> collect = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//       System.out.println(collect);
//       System.out.println((char)65);
		// 4 .How do you find frequency of each element in an array or a list?
//        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//        Map<String, Long> collect = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(collect);
		// 5.How do you sort the given list of decimals in reverse order?
//		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//		 List<Double> collect = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(collect);

		// 6.Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix
		// and ‘,’ as delimiter?
//		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
//		String collect = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
//		System.out.println(collect);
		// 7.From the given list of integers, print the numbers which are multiples of
		// 5?
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		listOfIntegers.stream().filter(n->n%5==0).forEach(System.out::println);
//		List<Integer> collect = listOfIntegers.stream().filter(n->n%5==0).collect(Collectors.toList());
//		System.out.println(collect);
		// 8.Given a list of integers, find maximum and minimum of those numbers?
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		Integer integer = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
//		Integer integer2 = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
//		System.out.println(integer);
//		System.out.println(integer2);

		// 9.How do you merge two unsorted arrays into single sorted array using Java 8
		// streams?
//		int[] a = new int[] {4, 2, 7, 1};
//        int[] b = new int[] {8, 3, 9, 5};
//        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//        System.out.println(Arrays.toString(array));
//		String[] a = {"apple", "banana", "grape"};
//		String[] b = {"orange", "kiwi", "cherry"};
//		String[] array = Stream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray(String[]::new);
//		System.out.println(Arrays.toString(array));
//		
		// 10.How do you merge two unsorted arrays into single sorted array without
		// duplicates?
//			int[] a = new int[] { 4, 2, 5, 1 };
//			int[] b = new int[] { 8, 1, 9, 5 };
//			int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
//			System.out.println(Arrays.toString(array));
		// 11.How do you get three maximum numbers and three minimum numbers from the
		// given list
//		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		 List<Integer> collect = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());
//		 System.out.println(collect);
//		 List<Integer> collect2 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
//		 System.out.println(collect2);

		// 12.Java 8 program to check if two strings are anagrams or not?
//		String s1 = "RaceCar";
//        String s2 = "CarRace";
//        String s11 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//        String s22 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//        if(s11.equals(s22)) {
//        	System.out.println("yes");
//        }else {
//        	System.out.println("no");
//        }
		// 13. Find sum of all digits of a number in Java 8?
//		int i = 15623;
//		//Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
//		Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(s->Integer.parseInt(s)));
//		System.out.println(collect);
//		int sum=0;
//		while(i>0) {
//			int rem=i%10;
//			sum=sum+rem;
//			 i=i/10;
//		}
//		System.out.println(sum);
		// 14. Find second largest number in an integer array?
		// List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		// List<Integer> collect =
		// listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
//		Integer integer = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(integer);
		// 15.Given a list of strings, sort them according to increasing order of their
		// length?
//		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
//		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
//		List<String> collect = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//		System.out.println(collect);
		// 16. Given an integer array, find sum and average of all elements?
//		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
//		int sum = Arrays.stream(a).sum();
//		System.out.println(sum);
//		double asDouble = Arrays.stream(a).average().getAsDouble();
//		System.out.println(asDouble);
		// 17.How do you find common elements between two arrays?
//		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
//        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
//        List<Integer> collect = list1.stream().filter(i->list2.contains(i)).collect(Collectors.toList());
//        System.out.println(collect);
		// 18.Reverse each word of a string using Java 8 streams?
//		String str = "Java Concept Of The Day";
//		String collect = str.chars().mapToObj(i->String.valueOf((char)i)).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
//		System.out.println(collect);
//		String collect2 = Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
//		System.out.println(collect2);
		// 19.How do you find sum of first 10 natural numbers?
//		IntStream range = IntStream.range(1, 11);
//		int sum = range.sum();
//		System.out.println(sum);
		// 20.Reverse an integer array
//		 int[] array = new int[] {5, 1, 7, 3, 9, 6};
//		 int[] array2 = IntStream.range(0, array.length).map(i->array.length-i-1).toArray();
//		 System.out.println(Arrays.toString(array2));

		// 21.Print first 10 even numbers
		// IntStream.range(1, 11).map(i->i*2).forEach(System.out::println);
		// 22.How do you find the most repeated element in an array?
//		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
//		Entry<String, Long> entry = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
//		max(Map.Entry.comparingByValue()).get();
//		System.out.println(entry);
		// 23.Palindrome program using Java 8 streams
//		String str = "ROTATOR";
//		boolean noneMatch = IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
//		System.out.println(noneMatch);
		// 24.Given a list of strings, find out those strings which start with a number?
//		 List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
//		 List<String> collect = listOfStrings.stream().filter(s->Character.isDigit(s.charAt(0))).collect(Collectors.toList());
//		 System.out.println(collect);
		// 25.How do you extract duplicate elements from an array?
//		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
//		Set<Integer> set=new HashSet<Integer>();
//		Set<Integer> collect = listOfIntegers.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
//		List<Entry<Integer, Long>> collect2 = listOfIntegers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toList());
//		System.out.println(collect);
//		System.out.println(collect2);
		// 26.Print duplicate characters in a string?
//		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
//		Set<String> set=new HashSet<String>();
//		List<String> collect = Arrays.stream(inputString.split("")).filter(c->!set.add(c)).collect(Collectors.toList());
//		System.out.println(collect);
		// 27.Find first repeated character in a string?
//		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
//		LinkedHashMap<String, Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
//		System.out.println(collect);
//		 Entry<String, Long> entry = collect.entrySet().stream().filter(i->i.getValue()>1).findFirst().get();
//		System.out.println(entry);
		// 28.Find first non-repeated character in a string?
//		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
//		 String string = Arrays.stream(inputString.split(""))
//				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//				.filter(i -> i.getValue() == 1).map(i->i.getKey()).findFirst().get();
//		System.out.println(string);
	}
}
