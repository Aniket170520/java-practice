package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreams {

    public static void practiceMapStreams(){
        Map<Integer, String> employeeNames = Map.of(
                101, "Alice",
                102, "Bob",
                103, "Charlie",
                104, "Alice",
                105, "David"
        );

//        Convert a Map<Integer, String> to List<String> containing only the values.
//        Get all entries where key > 10.
//        Get entries where value starts with "A".
//        Sort Map by value
//        Find the entry with the highest value alphabetically.
//        Count entries where value length > 5
//        Get first entry using Stream

//    Convert a Map<Integer, String> to List<String> containing only the keys.
        System.out.println(employeeNames.values().stream()
                .toList());

//        Get all entries where key > 10.
        System.out.println(employeeNames.entrySet().stream()
                .filter(e -> e.getKey() > 10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

//        Get entries where value starts with "A".
        System.out.println(employeeNames.entrySet().stream()
                .filter(x -> x.getValue().startsWith("A"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

//        Sort Map by value
        Map<Integer, String> sortedMap= employeeNames.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) ->a, LinkedHashMap::new));
        System.out.println(sortedMap);

//        Find the entry with the highest value alphabetically.
        System.out.println(employeeNames.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get());

//        Count entries where value length > 5
        System.out.println(employeeNames.keySet().stream()
                .filter(x -> x>103)
                .count());

//        Get first entry using Stream
        System.out.println(employeeNames.entrySet().stream()
                .findFirst().get());
    }
}
