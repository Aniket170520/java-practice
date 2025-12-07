package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void javaStreams() {
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
//        Find the first element in a stream.
//        Check if any string in a list has length > 5.
//        Convert a list of strings to uppercase.
//        Sort a list of integers in descending order.
//        Sort a list of strings in reverse alphabetical order.
//        Remove duplicates from a list using streams.
//        Find the maximum and minimum numbers in a list.
//        Join all strings from a list into a single comma-separated string.
//        Group a list of strings by their length.
//        Count occurrences of each word in a list (word frequency).
//        Partition a list of numbers into even and odd.
//        Flatten a list of lists into a single list using flatMap.
//        Find the second-highest number in a list using stream.
//        Find duplicate elements in a list using streams.
//        Count occurrence of a given character in a string
//        Find First Non-Repeated Character/integer in a String
//        Find all strings that are palindromes in a list.
//        Sort a list based on the frequency of elements in descending order.
//        Find all pairs of numbers from a list that add up to a given sum.
//        Calculate the product of all numbers in a list
//        Find the word with the most vowels in a list


        //        Print all elements of a list using streams.
        list1.forEach(System.out::println);

//        Filter even numbers from a list of integers.
        System.out.println(list.stream()
                .filter(x -> x % 2 == 0)
                .toList());

//        Filter strings that start with a specific letter (e.g., 'A').
        System.out.println(list1.stream()
                .filter(x -> x.toLowerCase().startsWith("a"))
                .toList());

//        Count elements in a list using streams.
        System.out.println(list.stream().count());

//                Find the first element in a stream.
        System.out.println(list.stream().findFirst().get());

//        Check if any string in a list has length > 5.
        System.out.println(list1.stream().filter(x -> x.length() > 5).toList());

//        Convert a list of strings to uppercase.
        System.out.println(list1.stream().map(x -> x.toUpperCase()).toList());

//      Sort a list of integers in descending order.
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).toList());

//                Sort a list of strings in reverse alphabetical order.
        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).toList());

        //Remove duplicates from a list using streams.
        System.out.println(list1.stream().distinct().toList());

        //Find the maximum and minimum numbers in a list.
        System.out.println(list.stream().max(Comparator.comparingInt(a -> a)).get());

        System.out.println(list.stream().min(Comparator.comparingInt(a -> a)).get());

        //Join all strings from a list into a single comma-separated string.
        System.out.println(list1.stream().collect(Collectors.joining(",")));

        //Group a list of strings by their length.
        System.out.println(list1.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(list1.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.toSet())));

        //Count occurrences of each word in a list (word frequency).
        System.out.println(list1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        //Partition a list of numbers into even and odd.
        System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        //Flatten a list of lists into a single list using flatMap.
        System.out.println(nested.stream().flatMap(x -> x.stream()).toList());

        //Find the second-highest number in a list using stream.
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //Find duplicate elements in a list using streams.
        System.out.println(
                list1.stream()
                        .filter(name -> !set.add(name))
                        .distinct()
                        .toList());

        //Count occurrence of a given character in a string
        String s = "ansdnknskdwks";
        System.out.println(s.chars().filter(x -> x == 's').count());

        //Find First Non-Repeated Character in a String
        System.out.println(s.chars().mapToObj(x -> (char) x)
                .filter(x -> s.indexOf(x) == s.lastIndexOf(x))
                .findFirst().get());

        System.out.println(list.stream()
                .filter(x -> Collections.frequency(list, x) ==1)
                .findFirst().get());

        //Find all strings that are palindromes in a list.
        List<String> words = Arrays.asList("radar", "level", "world", "java");

        System.out.println(words.stream()
                .filter(x -> new StringBuilder(x).reverse().toString().equals(x))
                .toList());

        //Sort a list based on the frequency of elements in descending order.
        System.out.println(list.stream()
                .sorted(Comparator.comparingInt(x -> Collections.frequency(list, x)))
                .distinct()
                .toList());

        //Find all pairs of numbers from a list that add up to a given sum.
        System.out.println(list.stream()
                .flatMap(a -> list.stream()
                        .filter(b -> a + b == 10 && a < b)
                        .map(b -> Arrays.asList(a, b)))
                .collect(Collectors.toList()));

        //Calculate the product of all numbers in a list
        System.out.println(list.stream()
                .reduce(1, (a,b) -> a*b));

        //Find the word with the most vowels in a list
        System.out.println(list1.stream()
                .max(Comparator.comparingInt(x -> (int) x.chars()
                        .filter(c -> "aeiou".indexOf(c) != -1).count())).get());
    }
}
