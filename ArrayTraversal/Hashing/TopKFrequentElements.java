package ArrayTraversal.Hashing;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] arr, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Integer> pq =new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // Add all keys
        pq.addAll(map.keySet());

        // Step 3: Extract top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3};

        int k = 2;

        int[] result = topKFrequent(arr, k);

        System.out.print("Top K Frequent Elements: ");

        for (int num : result) {

            System.out.print(num + " ");
        }
    }
}