package Hash.HashMap.PA;
import java.util.HashMap;

public class WordFrequencyCounter {

    public static HashMap<String, Integer> countWordFrequency(String sentence) {
        // Create a Hash.HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate through the words
        for (String word : words) {
            // If the word is already in the map, increment its count
            // Else, add the word with count 1
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                count += 1;
                wordCountMap.put(word, count);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Return the word frequency map
        return wordCountMap;
    }

    public static void main(String[] args) {
        // Example sentence
        String sentence = "apple banana apple orange banana apple";

        // Get the word frequency map
        HashMap<String, Integer> result = countWordFrequency(sentence);

        // Print the result
        System.out.println(result);
    }
}