/*String Rotation; Assume you have a method i s S u b s t r i n g which checks if one word is a substring of another.
        Given two strings, si and s2, write code to check if s2 is a rotation of si using only one call to
        isSubst ring [e.g., "waterbottle" is a rotation oP'erbottlewat"),

 */
public class StringRotation1_9 {
    public static void main(String[] args) {
        String s1 = "camera";
        String s2 = "meraca";

        System.out.println(isSubstring(s1, s2));
    }

    public static boolean isSubstring(String s1, String s2){
        int[] arrayFirstLetter = new int[s1.length()];

        if(s1.length() != s2.length()){
            return false;
        }
        int j = 0;

        //create an array with the index of the first letter of s1 in s2
        for (int i = 0; i < s1.length(); i++) {
            if(s2.charAt(i) == s1.charAt(0)){
                arrayFirstLetter[j] = i;
                j++;
            }
        }

        //compares if the letters in s2 are in the same of s1.
        for (int k: arrayFirstLetter) {
            int x = k;
            int count = 0;
            for (int l = 0; l < s1.length(); l++) {
                if(s2.charAt(x) != s1.charAt(l)) {
                    break;
                }else{
                    count++;
            }
                x++;
                if(x == s1.length()){
                    x = 0;
                }
            }
            if(count == s1.length()){
                return true;
            }
        }
    return false;
    }
}
