package sorting

import extention.swap

class BubbleSort : SoringAlgorithm<MutableList<Int>> {
    init {
        println("Bubble Sort is Starting \n" +
                "※ Worst case performance O(n^2) \n" +
                "※ Best case performance O(n) \n" +
                "※ Average case performance O(n^2)\n")

    }
    override fun sort(arr: MutableList<Int>) {
        arr.forEachIndexed { index, i ->
            for (j in 1 until arr.size - index) {
                if (arr[j] < arr[j - 1]) {
                    arr.swap(j, j - 1)
                }
            }
        }

        println(arr.toString())

    }
}