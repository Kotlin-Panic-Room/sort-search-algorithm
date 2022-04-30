package sorting

import extention.swap

class SelectionSort: SoringAlgorithm<MutableList<Int>> {
    init {
        println("Selection Sort is Starting \n" +
                "※ Worst case performance O(n^2) \n" +
                "※ Best case performance O(n) \n" +
                "※ Average case performance O(n^2)\n")
    }

    override fun sort(arr: MutableList<Int>) {


        arr.forEachIndexed{ idx,element ->
            var pos = idx

            // 현재 인덱스부터 뒤쪽을 보면서 작은게 있으면 포지션에 저장해둠
            for(j in idx until arr.size){
                pos = if (arr[j] < arr[pos]) j else pos
            }
            arr.swap(pos, idx)
        }

        println(arr.toString())
    }
}