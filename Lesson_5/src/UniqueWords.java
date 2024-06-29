import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "банан",
                "груша", "персик", "виноград", "яблоко", "апельсин",
                "персик", "яблоко", "груша", "апельсин", "виноград",
                "банан", "яблоко", "виноград", "персик", "яблоко"
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("1. Уникальные слова: " + uniqueWords);
        System.out.println("2. Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
