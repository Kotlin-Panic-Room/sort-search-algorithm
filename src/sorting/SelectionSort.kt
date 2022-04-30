package sorting

import extention.swap

class SelectionSort: SoringAlgorithm<MutableList<Int>> {
    init {
        println("Selection Sort is Starting \n" +
                "Worst case performance O(n^2) \n" +
                "Best case performance O(n) \n" +
                "Average case performance O(n^2)")
    }

    override fun sort(arr: MutableList<Int>) {


        arr.forEachIndexed{ idx,element ->
            var pos = idx

            for(j in idx until arr.size){
                pos = if (arr[j] < arr[pos]) j else pos
            }
            println(arr.toString())
            arr.swap(pos, idx)
        }

        println(arr.toString())
    }
}