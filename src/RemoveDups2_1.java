import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;

//Remove Dups: Write code to remove duplicates from an unsorted linked list.
public class RemoveDups2_1{
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList();
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll.add(5);
        ll.add(3);

        Set<Integer> hs = new HashSet<>();
        LinkedList<Integer> finalList = new LinkedList();

        for (int i : ll) {
            if(!hs.contains(i)){
                finalList.add(i);
                hs.add(i);
            }
        }
        System.out.println(finalList);
    }
}