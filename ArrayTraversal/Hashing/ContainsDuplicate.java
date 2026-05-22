package ArrayTraversal.Hashing;
import java.util.HashSet;


public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1};

        boolean result = containsDuplicate(arr);

        if (result) {
            System.out.println("Array contains duplicates");
        } else {
            System.out.println("Array does not contain duplicates");
        }
    }
    
}
