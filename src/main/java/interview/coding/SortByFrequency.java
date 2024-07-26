package interview.coding;

import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;

public class SortByFrequency {
    public static void main(String[] args) {
        SortByFrequency s = new SortByFrequency();
//        s.sort(Arrays.asList(2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12));
        List<Integer> result = s.sort(Arrays.asList(2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12));
        System.out.println(result);
    }

    public List<Integer> sort(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : list) {
            if (frequencyMap.containsKey(num)) {
                Integer val = frequencyMap.get(num);
                frequencyMap.put(num, ++val);
            } else {
                frequencyMap.put(num, 1);
            }
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); // same as above
        }

        System.out.println(frequencyMap);

        list.sort((first, second) -> {
            int comparisonResult = frequencyMap.get(second).compareTo(frequencyMap.get(first));
            if (comparisonResult == 0) {
                return first.compareTo(second);
            }
            return comparisonResult;
        });

        return list;
    }
}
