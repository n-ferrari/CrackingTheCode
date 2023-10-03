//Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
//       Hints: #44, #117, #132
public class IsUnique1_1_2 {
    public static void main(String[] args) {
        System.out.println(isUnique("ab"));
    }
    public static boolean isUnique(String word){
        int[] lettersWord = new int[256];

        for (int i = 0; i < word.length(); i++) {
            if(lettersWord[(int) word.charAt(i)] == 1){
                return false;
            }else{
                lettersWord[(int) word.charAt(i)] += 1;
            }
        }
        return true;
    }
}
