/*String Compression: Implement a method to perform basic string compression using the
        counts of repeated characters. For example, the string aabcccccaaa
        would become a2blc5a3, If the "compressed" string would not become
        smaller than the original string, your method should return the
        original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression1_6 {

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
    }
    public static String stringCompression(String word){
        String stringCompressed = "";
        char letter = word.charAt(0);
        stringCompressed = stringCompressed + letter;
        int repeat = 0;
        for (int i = 1; i < word.length(); i++) {
            if(word.charAt(i) != letter){
                stringCompressed = stringCompressed + (repeat + 1) + word.charAt(i);
                letter = word.charAt(i);
                repeat = 0;
            }else{
                repeat++;
            }
        }
        stringCompressed = stringCompressed + (repeat + 1);
        return stringCompressed;
    }
}
