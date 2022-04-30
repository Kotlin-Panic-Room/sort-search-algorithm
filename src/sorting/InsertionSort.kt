package sorting

import extention.swap


class InsertionSort: SoringAlgorithm<MutableList<Int>> {
    init {
        println("Insertion Sort is Starting \n" +
                "※ Worst case performance O(n^2) \n" +
                "※ Best case performance O(n) \n" +
                "※ Average case performance O(n^2)")
    }

    override fun sort(arr: MutableList<Int>) {

        arr.forEachIndexed{ idx,element ->
            var pos = idx
            while (0 < pos && element < arr[pos - 1] ){
                arr.swap(pos, pos - 1)
                pos--
            }
        }

        println(arr.toString())

    }
}