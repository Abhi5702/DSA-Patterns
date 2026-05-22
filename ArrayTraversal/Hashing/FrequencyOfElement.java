package ArrayTraversal.Hashing;

import java.util.HashMap;

public class FrequencyOfElement {

    public static void frequencyOfElement(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {

            if (map.containsKey(num)) {

                map.put(num, map.get(num) + 1);

            } else {

                map.put(num, 1);
            }
        }

        // Print frequencies
        for (int key : map.keySet()) {

            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        frequencyOfElement(arr);
    }
}