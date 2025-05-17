package remove_duplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        int[] resultArray = removeDuplicatesUsingSet(inputArray);
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }

    public static int[] removeDuplicatesUsingSet(int[] array) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
