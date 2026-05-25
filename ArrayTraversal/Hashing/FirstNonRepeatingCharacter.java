package ArrayTraversal.Hashing;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first non-repeating character
        for (char ch : str.toCharArray()) {

            if (map.get(ch) == 1) {

                return ch;
            }
        }

        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {

        String str = "swiss";

        char result = firstNonRepeating(str);

        if (result != '\0') {

            System.out.println("First non-repeating character: " + result);

        } else {

            System.out.println("No non-repeating character found");
        }
    }
}