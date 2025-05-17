package string_permutation

import java.io.File

fun main() {
    val inputFilePath = "src/string_permutation/input.txt"
    val inputString = File(inputFilePath).readText().trim()
    println("Input String: $inputString")
    println("Unique Permutations:")
    generateUniquePermutations(inputString).forEach { println(it) }
}

fun generateUniquePermutations(str: String): List<String> {
    val result = mutableListOf<String>()
    val sortedStr = str.toCharArray().sorted()  // Sort the string
    val visited = BooleanArray(str.length)     // Track visited characters
    permuteHelper("", sortedStr, visited, result)
    return result
}

private fun permuteHelper(
    prefix: String,
    chars: List<Char>,
    visited: BooleanArray,
    result: MutableList<String>
) {
    if (prefix.length == chars.size) {
        result.add(prefix)
        return
    }

    for (i in chars.indices) {
        // Skip duplicates
        if (visited[i] || (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1])) continue

        visited[i] = true
        permuteHelper(prefix + chars[i], chars, visited, result)
        visited[i] = false
    }
}
