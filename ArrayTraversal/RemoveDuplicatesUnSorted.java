package ArrayTraversal;

import java.util.HashSet;

public class RemoveDuplicatesUnSorted {

    public static void removeDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {

        

        int[] arr = {1,2,3,2,4,1,5};

        removeDuplicates(arr);
    }
}
