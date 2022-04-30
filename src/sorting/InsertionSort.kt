package sorting

import extention.swap


class InsertionSort: SoringAlgorithm<MutableList<Int>> {
    init {
        println("Insertion Sort is Starting \n" +
                "※ Worst case performance O(n^2) \n" +
                "※ Best case performance O(n) \n" +
                "※ Average case performance O(n^2)\n")
    }

    override fun sort(arr: MutableList<Int>) {

        arr.forEachIndexed{ idx,element ->
            var pos = idx
            // 앞쪽을 살펴보면서 바꿈
            while (0 < pos && element < arr[pos - 1] ){
                arr.swap(pos, pos - 1)
                pos--
            }
        }

        println(arr.toString())

    }
}