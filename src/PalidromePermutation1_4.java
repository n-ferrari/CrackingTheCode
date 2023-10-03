/*Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin-
        drome. A palindrome is a word or phrase that is the same forwards and backwards.
        A permutation is a rearrangement of letters. The palindrome does not need to be limited
        to just dictionary words.

 */
public class PalidromePermutation1_4 {
    public static void main(String[] args) {
        String word = "arara";
        System.out.println(isPalindromePermuted(word));

    }

    public static boolean isPalindromePermuted(String word) {
        int[] arrayLetters = arrayLettersAscii(word);
        int pairsNeeded = (word.length() / 2);
        for (int i = 0; i < arrayLetters.length; i++) {
            if (arrayLetters[i] > 0) {
                pairsNeeded = pairsNeeded - (arrayLetters[i] / 2);
            }
        }
        if (pairsNeeded == 0) {
            return true;
        } else {
            return false;
        }
    }

        public static int[] arrayLettersAscii (String word){
            int[] lettersWord = new int[256];

            for (int i = 0; i < word.length(); i++) {
                lettersWord[word.charAt(i)] += 1;
            }
            return lettersWord;
        }
    }

