/*Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin-
        drome. A palindrome is a word or phrase that is the same forwards and backwards.
        A permutation is a rearrangement of letters. The palindrome does not need to be limited
        to just dictionary words.

 */
public class PalidromePermutation1_4 {
    public static void main(String[] args) {
        String word = "aabbcdef";
        System.out.println(isPalindromePermuted(word));

    }

    public static boolean isPalindromePermuted(String word) {
        int[] arrayLetters = arrayLettersAscii(word);

        // Use Math.floorDiv for explicit flooring the div
        int pairsNeeded = (numberCharactersWithoutSpace(word) / 2);
        for (int i = 0; i < arrayLetters.length; i++) {
            if (arrayLetters[i] > 0) {
                // Use Math.floorDiv for explicit flooring the div
                pairsNeeded = pairsNeeded - (arrayLetters[i] / 2);
            }
        }
        return (pairsNeeded == 0);
    }

    public static int[] arrayLettersAscii (String word){
        int[] lettersWord = new int[256];
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != 32){
                lettersWord[word.charAt(i)] += 1;
            }
        }
        return lettersWord;
    }

    public static int numberCharactersWithoutSpace(String word){
        int number = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' '){
                number++;
            }
        }
        return number;
    }
}

