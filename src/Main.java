import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        printOddNumbers(nums);
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        //task2
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printEvenNumbers(nums);
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        Set<Integer> evenNumbers = new TreeSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        for (Integer evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        //task3
        List<String> words = new ArrayList<>(List.of(
                "apple", "banana", "apple", "orange", "banana",
                "grape", "kiwi", "orange", "melon", "kiwi"
        ));
        printUniqueWords(words);
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
        //task4
        public class DuplicateCounter {
            public static void main(String[] args) {
                List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

                printDuplicateCounts(strings);
            }
            public static void printDuplicateCounts(List<String> words) {
                Map<String, Integer> wordCountMap = new HashMap<>();
                for (String word : words) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
                for (int count : wordCountMap.values()) {
                    if (count > 1) {
                        System.out.println(count - 1);
                    }
                }
            }
        }
    }
