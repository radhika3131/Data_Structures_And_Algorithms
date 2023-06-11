import java.util.Arrays;

public class WordCapitalization {
    public static String[] capitalizeWords(String[] words) {
        return capitalizeWordsHelper(words, 0);
    }

    private static String[] capitalizeWordsHelper(String[] words, int index) {
        if (index == words.length) {
            return new String[0]; // Base case: when the end of the array is reached, return an empty array
        }

        String currentWord = words[index];
        String capitalizedWord = currentWord.toUpperCase();
        String[] remainingWords = capitalizeWordsHelper(words, index + 1);

        String[] result = new String[remainingWords.length + 1];
        result[0] = capitalizedWord;
        System.arraycopy(remainingWords, 0, result, 1, remainingWords.length);

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry"};
        String[] capitalizedWords = capitalizeWords(words);
        System.out.println("Capitalized Words: " + Arrays.toString(capitalizedWords));
    }
}
