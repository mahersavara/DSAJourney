package string_permutation

import java.io.File

fun main() {
    val inputFilePath = "src/string_permutation/input.txt"
    val inputString = File(inputFilePath).readText().trim()
    println("Input String: $inputString")
    println("Permutations:")
    generatePermutations(inputString).forEach { println(it) }
}

fun generatePermutations(str: String): List<String> {
    val result = mutableListOf<String>()
    permuteHelper("", str, result)
    return result
}

private fun permuteHelper(prefix: String, remaining: String, result: MutableList<String>) {
    if (remaining.isEmpty()) {
        result.add(prefix)
    } else {
        for (i in remaining.indices) {
            permuteHelper(
                prefix + remaining[i],
                remaining.substring(0, i) + remaining.substring(i + 1),
                result
            )
        }
    }
}
