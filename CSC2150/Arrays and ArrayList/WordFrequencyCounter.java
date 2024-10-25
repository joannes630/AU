import java.util.HashMap;

public class WordFrequencyCounter {

    public static HashMap<String, Integer> countWordFrequency(String sentence) {
        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate through the words
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with count 1
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