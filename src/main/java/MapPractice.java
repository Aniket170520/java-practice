import java.util.*;
import java.util.stream.Collectors;

public class MapPractice {

    public static void mapPreparation(){
//        Create a map and add key-value pairs.
        Map<String, Integer> map = new HashMap<>(Map.of("aman", 2, "Raman", 3, "Vipul", 4));
        map.put("aniket", 1);
        String s1 = "Banana";
        String s2 = "Java is great and java is powerful";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>(Map.of("Aman", 3, "Raman", 2, "Vipul", 4));
        List<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Maango", "Cherry", "Orange", "Pi", "Banana", "Banana"));

        System.out.println(map);

//                Retrieve a value by key from a map.
        System.out.println(map.get("aniket"));

//                Check if a key exists in a map.
        System.out.println(map.containsKey("aniket"));

//        Iterate over keys and values in a map.
        map.forEach((k, v) -> System.out.println("key: "  + k + " value: " + v));

//        Remove a key-value pair from a map.
        map.remove("aman");
        System.out.println(map);

//        Update the value of an existing key.
        map.put("aman", 5);
        System.out.println(map);

//                Check the size of the map.
        System.out.println(map.size());


//                Clear the map.
        map.clear();
        System.out.println(map);

//        Check if the map is empty.
        System.out.println(map.isEmpty());



//        Count the frequency of characters in a string using a map.
        for (char c : s1.toCharArray()){
            if (' ' != c){
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(map1);

//                Count the frequency of words in a sentence using a map.
        System.out.println(Arrays.stream(s2.split(" "))
                .map(x -> x.toLowerCase())
                .collect(Collectors.groupingBy(x-> x, Collectors.counting())));


//        Sort a map by keys.
        TreeMap<String, Integer> map3 = new TreeMap<>(map2);
        System.out.println(map3);


//                Sort a map by values.
        Map<String, Integer> sortedByValueMap = map2.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(sortedByValueMap);

//        Group a list of strings by their length using a map.
        System.out.println(
                list1.stream()
                        .collect(Collectors.groupingBy(x ->x.length()))
        );

//        Merge two maps.
        map.putAll(map2);
        System.out.println(map);


//                Reverse a map (values as keys and keys as values).
        Map<Integer, String> map4 = map2.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey
                ));

        System.out.println(map4);

//            Filter a map to keep only entries with value > 2
        System.out.println(map3.entrySet().stream()
                        .filter(x -> x.getValue()> 2)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                        ))
                );

    }
}
