package sorting

import extention.swap

class HeapSort: SoringAlgorithm<MutableList<Int>> {
    init {
        println("Merge Sort is Starting \n" +
                "※The performance of this algorithm is O(n log n) \n")
    }


    override fun sort(arr: MutableList<Int>) {

        var heapSize = arr.size - 1
        buildMaxHeap(arr)
        for(index in heapSize downTo 1){
            arr.swap(0, index)
            heapSize--
            maxHeapify(arr, 0, heapSize)
        }
        println(arr.toString())
    }

    private fun buildMaxHeap(arr: MutableList<Int>){
        for(index in arr.size - 1 downTo  0){
            maxHeapify(arr, index, arr.size - 1)
        }
    }
    private fun maxHeapify(arr: MutableList<Int>, start: Int, size: Int){
        val leftElementIndex = start * 2 + 1
        val rightElementIndex = start * 2 + 2
        var maxElementIndex = start

        if ( (leftElementIndex <= size) && (arr[leftElementIndex] > arr[start]) ){
            maxElementIndex = leftElementIndex;
        }

        if ( (rightElementIndex <= size) && (arr[rightElementIndex] > arr[maxElementIndex]) ){
            maxElementIndex = rightElementIndex;
        }

        if (maxElementIndex != start){
            arr.swap(start, maxElementIndex)
            maxHeapify(arr, maxElementIndex, size);
        }
    }
}