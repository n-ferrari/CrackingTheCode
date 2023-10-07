//One Away: There are three types of edits that can be performed on strings: insert a character,
//        remove a character, or replace a character. Given two strings, write a function to check
//        if they are one edit (or zero edits) away.
//        EXAMPLE
//        pale, pie -> true pales, pale -> true pale, bale -> true pale, bake -> false
public class OneWay1_5 {
    public static void main(String[] args) {
        String word1 = "pale";
        String word2 = "bake";

        System.out.println(isOneWay(word1, word2));

    }

    public static boolean isOneWay(String word1, String word2) {
        return oneLetterReplaced(word1, word2) || oneLetterDifference(word1, word2);
    }

    public static boolean oneLetterReplaced(String word1, String word2) {
        int differenceSize = word1.length() - word2.length();
        if (differenceSize == 0) {
            int troca = 0;
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) != word2.charAt(i)) {
                    troca += 1;
                }
            }
            return (troca == 1);
        }
        return false;
    }

    public static boolean oneLetterDifference(String word1, String word2){
        int differenceSize = word1.length() - word2.length();
        if(differenceSize == 1 || differenceSize == -1){
            String maior, menor;
            if(word1.length() > word2.length()){
                maior = word1;
                menor = word2;
            }else{
                maior = word2;
                menor = word1;
            }
            int j = 0;
            int troca = 0;
            int letrasIguais = 0; //this variable was created to avoid an exception when a letter was added in the end
            for (int i = 0; i < maior.length(); i++) {
                if(maior.charAt(i) != menor.charAt(j)){
                    troca++;
                    i++;
                }else{
                    letrasIguais++;
                }
                if(letrasIguais == menor.length()){
                    return true;
                }
                j++;
            }
            return troca == 1;
        }else{
            return false;
        }

    }
}
