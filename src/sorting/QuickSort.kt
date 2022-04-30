package sorting

import extention.swap

class QuickSort: SoringAlgorithm<MutableList<Int>> {
    init {
        println("Quick Sort is Starting \n" +
                "※The performance of this algorithm is O(n log n) \n")
    }

    override fun sort(arr: MutableList<Int>) {
        quickSort1(arr,0,arr.size - 1)
        println(arr.toString())
    }

    private fun quickSort1(arr: MutableList<Int>, first: Int, last: Int){

        if(first >= last) return
        val mid = arr[(first+last) / 2]
        var i = first
        var j = last

        while(i <= j){
            while(arr[i] < mid){
                i++
            }
            while(arr[j] > mid){
                j--
            }
            if (i <= j) {
                arr.swap(i,j)
                i++
                j--

            }
        }


        if(first < j){
            quickSort1(arr,first,j)
        }
        if(last > i){
            quickSort1(arr,i,last)
        }
    }
    private fun quickSort2(){

    }
}