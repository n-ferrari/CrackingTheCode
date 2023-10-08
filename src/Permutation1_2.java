//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
public class Permutation1_2 {
    public static void main(String[] args) {
        String one = "cbA";
        String two = "Abc";
        System.out.println(isPermutation(one, two));
    }

    public static boolean isPermutation(String one, String two) {
        int[] lettersOne = arrayLettersAscii(one);
        int[] lettersTwo = arrayLettersAscii(two);

        for (int i = 0; i < lettersOne.length; i++) {
            if(lettersOne[i] != lettersTwo[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] arrayLettersAscii(String word) {
        int[] lettersWord = new int[256];

        for (int i = 0; i < word.length(); i++) {
            lettersWord[ word.charAt(i)] += 1;
        }
        return lettersWord;
    }
}
