package ex_09_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Lab096_FindDuplicateelements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);

    }
}
