package remove_duplicates

fun main() {
    val inputArray = intArrayOf(1, 2, 2, 3, 4, 4, 5)
    println("Original Array: ${inputArray.joinToString()}")
    val resultArray = removeDuplicates(inputArray)
    println("Array after removing duplicates: ${resultArray.joinToString()}")
}

fun removeDuplicates(array: IntArray): IntArray {
    return array.distinct().toIntArray()
}
