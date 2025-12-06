import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void javaStreams(){
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 23, 1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7));
        List<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Maango", "Cherry", "Orange", "Pi", "Banana", "Banana"));
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e")
        );
        Set<String> set = new HashSet<>();

        //        Print all elements of a list using streams.
//        Filter even numbers from a list of integers.
//        Filter strings that start with a specific letter (e.g., 'A').
//        Count elements in a list using streams.
//                Find the first element in a stream.
//        Check if any string in a list has length > 5.
//        Convert a list of strings to uppercase.
//      Sort a list of integers in descending order.
//                Sort a list of strings in reverse alphabetical order.
        //Remove duplicates from a list using streams.
        //Find the maximum and minimum numbers in a list.
        //Join all strings from a list into a single comma-separated string.
        //Group a list of strings by their length.
        //Count occurrences of each word in a list (word frequency).
        //Partition a list of numbers into even and odd.
        //Flatten a list of lists into a single list using flatMap.
        //Find the second-highest number in a list using stream.
        //Find duplicate elements in a list using streams.

//        Print all elements of a list using streams.
        list1.stream()
                .forEach(x -> System.out.println(x));


//        Filter even numbers from a list of integers.
        System.out.println(
                list.stream()
                        .filter(x -> x%2 == 0)
                        .toList());


//        Filter strings that start with a specific letter (e.g., 'A').
        System.out.println(
                list1.stream()
                        .filter(x -> x.startsWith("A"))
                        .toList());


//        Count elements in a list using streams.
        System.out.println(
                list.stream().count());


//                Find the first element in a stream.
        System.out.println(
                list.stream()
                        .findFirst().get());


//        Check if any string in a list has length > 5.
        System.out.println(
                list1.stream()
                        .filter(s -> s.length() > 5)
                        .toList());


//        Convert a list of strings to uppercase.
        System.out.println(
                list1.stream()
                        .map(s -> s.toUpperCase())
                        .toList());


//      Sort a list of integers in descending order.
        System.out.println(
                list.stream()
                        .sorted((a,b) -> b-a)
                        .toList());


//                Sort a list of strings in reverse alphabetical order.
        System.out.println(
                list1.stream()
                        .sorted((s1, s2)-> s2.compareTo(s1))
                        .toList());


        //Remove duplicates from a list using streams.
        System.out.println(
                list.stream()
                        .distinct()
                        .toList());


        //Find the maximum and minimum numbers in a list.
        System.out.println(
                list.stream()
                        .min((a, b) -> a-b).get());


        System.out.println(
                list.stream()
                        .max((a, b) -> a-b).get());


        //Find the sum and average of a list of integers.
        System.out.println(
                list.stream()
                        .mapToInt(x -> x)
                        .sum());


        System.out.println(
                list.stream()
                        .mapToInt(x -> x)
                        .average().getAsDouble());


        //Join all strings from a list into a single comma-separated string.
        System.out.println(
                list1.stream()
                        .collect(Collectors.joining(",")));


        //Group a list of strings by their length.
        System.out.println(
                list1.stream()
                        .collect(Collectors.groupingBy(s -> s.length())));


        //Count occurrences of each word in a list (word frequency).
        System.out.println(
                list1.stream()
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting())));


        //Partition a list of numbers into even and odd.
        System.out.println(
                list.stream()
                        .collect(Collectors.partitioningBy(x -> x%2==0)));


        //Flatten a list of lists into a single list using flatMap.
        System.out.println(
                nested.stream()
                        .flatMap(x -> x.stream())
                        .toList());


        //Find the second-highest number in a list using stream.
        System.out.println(
                list.stream()
                        .sorted(Comparator.reverseOrder())
                        .distinct()
                        .skip(1)
                        .findFirst().get());


        //Find duplicate elements in a list using streams.
        System.out.println(
                list1.stream()
                        .filter(name -> !set.add(name))
                        .distinct()
                        .toList());
    }
}
