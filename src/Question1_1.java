//Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
 //       Hints: #44, #117, #132
public class Question1_1 {
    public static void main(String[] args) {
        System.out.println(isUnique("wsehua"));
    }
    public static boolean isUnique(String word){
        char[] lettersWord = new char[100];

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < lettersWord.length; j++) {
                if(lettersWord[j] == '\u0000'){
                    lettersWord[j] = word.charAt(i);
                    break;
                }else{
                    if(lettersWord[j] == word.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}