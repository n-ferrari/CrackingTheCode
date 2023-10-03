/*URLify: Write a method to replace all spaces in a string with '%20'.
        You may assume that the string has sufficient space at the end to hold the additional
        characters, and that you are given the "true" length of the string.
        (Note: If implementing in Java, please use a character array so that you can perform
        this operation in place.)
        EXAMPLE
        Input: "Mr 3ohn Smith 13 Output: "Mr%203ohn%20Smith"
 */
public class URLify1_3 {
    public static void main(String[] args) {
        String text = "the dog is brown";
        int length = 100;
        System.out.println(urlify(text, length));

    }
    public static String urlify(String string, int length){
        char[] characterArray = new char[length];
        int arrayindex = 0;
        for (int i = 0; i < string.length(); i++) {
            if((int) string.charAt(i) != 32){
                characterArray[arrayindex] = string.charAt(i);
            }else{
                characterArray[arrayindex] = '%';
                characterArray[arrayindex + 1] = '2';
                characterArray[arrayindex + 2] = '0';
                arrayindex = arrayindex + 2;
            }
            arrayindex++;
        }
        String text = new String(characterArray);
        return text;
    }
}
