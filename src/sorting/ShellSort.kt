package sorting

import extention.swap

class ShellSort : SoringAlgorithm<MutableList<Int>> {

    init {
        println("Shell Sort is Starting \n" +
                "※ Worst case performance O(nlog2 2n) \n" +
                "※ Best case performance O(n log n) \n" +
                "※ Average case performance depends on gap sequence")
    }

    override fun sort(arr: MutableList<Int>) {

        var k = arr.size / 2

        while (k > 0) {
            for (i in k until arr.size) {
                var j = i
                while (j >= k && arr[i] < arr[j - k]) {
                    arr.swap(j - k, j)
                    j -= k
                }
            }
            k /= 2
        }

        println(arr.toString())
    }
}