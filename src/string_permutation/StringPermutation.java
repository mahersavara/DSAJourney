package string_permutation;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static void main(String[] args) {
        String inputFilePath = "src/string_permutation/input.txt";
        try {
            String inputString = new java.util.Scanner(new File(inputFilePath)).useDelimiter("\\Z").next().trim();
            System.out.println("Input String: " + inputString);
            System.out.println("Unique Permutations:");
            Set<String> permutations = generateUniquePermutations(inputString);
            permutations.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
        }
    }

    public static Set<String> generateUniquePermutations(String str) {
        Set<String> result = new HashSet<>();
        permuteHelper("", str, result);
        return result;
    }

    private static void permuteHelper(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permuteHelper(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result
                );
            }
        }
    }
}
