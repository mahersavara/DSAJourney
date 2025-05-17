# String Permutation Guide

This folder contains the implementation of the **String Permutation Problem** in Kotlin. The goal of this problem is to
generate all possible permutations of the characters in a given string.

---

## 📂 Folder Structure

```
string_permutation/
├── StringPermutation.kt  # Kotlin implementation of the string permutation problem
├── input.txt             # Input file containing the string to be permuted
└── guide.md              # This guide file
```

---

## 🚀 Problem Description

The **String Permutation Problem** involves generating all possible arrangements (permutations) of the characters in a
given string. For example:

- Input: `"abc"`
- Output: `["abc", "acb", "bac", "bca", "cab", "cba"]`

---

## 🛠️ How to Use

### 1. Input File

- The `input.txt` file contains the string to be permuted.
- Modify the file to include your desired string.
    - Example:
      ```
      abc
      ```

### 2. Running the Program

- Compile and run the `StringPermutation.kt` file to generate permutations of the string in `input.txt`.

#### Steps to Run:

1. **Navigate to the Project Directory**:
   ```bash
   cd /f:/Work/ericodyssey/DSAJourney
   ```

2. **Compile the Kotlin File**:
   ```bash
   kotlinc src/string_permutation/StringPermutation.kt -include-runtime -d StringPermutation.jar
   ```

3. **Run the Program**:
   ```bash
   java -jar StringPermutation.jar
   ```

### 3. Output

- The program will read the string from `input.txt` and print all permutations to the console.
- Example Output for `abc`:
  ```
  Input String: abc
  Permutations:
  abc
  acb
  bac
  bca
  cab
  cba
  ```

---

## 🔍 Explanation of the Algorithm

### Key Idea

The problem is solved using **recursion**:

1. Fix one character at a time as the first character.
2. Recursively generate permutations for the remaining characters.
3. Combine the fixed character with the permutations of the remaining characters.

### Pseudocode

```
FUNCTION generatePermutations(string):
    IF string is empty:
        RETURN [""]
    
    result = []  # List to store all permutations
    
    FOR each character in string:
        # Fix the character
        fixedChar = character
        
        # Remaining substring after removing the fixed character
        remaining = string - fixedChar
        
        # Recursively generate permutations for the remaining substring
        subPermutations = generatePermutations(remaining)
        
        # Combine the fixed character with each sub-permutation
        FOR each permutation in subPermutations:
            result.add(fixedChar + permutation)
    
    RETURN result
```

---

## 📊 Complexity Analysis

### Time Complexity

- **Number of Permutations**: For a string of length `n`, there are `n!` (factorial of `n`) permutations.
- **Recursive Calls**: Each recursive call processes a substring of length `n-1`, `n-2`, ..., down to 1.
- **Overall Time Complexity**: `O(n * n!)`
    - `n!` for generating all permutations.
    - `O(n)` for combining the fixed character with each sub-permutation.

### Space Complexity

- **Recursive Stack**: The recursion depth is proportional to the length of the string, i.e., `O(n)`.
- **Result Storage**: Storing all permutations requires `O(n * n!)` space.

---

## 📬 Contact

For questions or feedback, feel free to reach out:

- **GitHub**: [mahersavara](https://github.com/mahersavara)
