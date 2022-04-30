package sorting

import kotlin.collections.ArrayList

class MergeSort : SoringAlgorithm<MutableList<Int>> {

    init {
        println("Merge Sort is Starting \n" +
                "※The performance of this algorithm is O(n log n) \n")
    }


    override fun sort(arr: MutableList<Int>) {

        if (arr.size <= 1) return

        val middleIndex = arr.size / 2
        // 배열 반갈죽
        val leftArr = MutableList(middleIndex){0}
        leftArr.forEachIndexed { index, _ ->
            leftArr[index] = arr[index]
        }

        val rightArr = MutableList(arr.size - middleIndex){0}
        rightArr.forEachIndexed { index, _ ->
            rightArr[index] = arr[index + middleIndex]
        }

        // 계속 나눔
        sort(leftArr)
        sort(rightArr)

        merge(arr, leftArr, rightArr)
        println(arr.toString())

    }

    private fun merge(originalArr: MutableList<Int>, leftArr: MutableList<Int>, rightArr: MutableList<Int>) {

        var index = 0
        var leftIndex = 0
        var rightIndex = 0


        while (leftIndex < leftArr.size && rightIndex < rightArr.size) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                originalArr[index] = leftArr[leftIndex]
                leftIndex++
            } else {
                originalArr[index] = rightArr[rightIndex]
                rightIndex++
            }
            index++
        }

        // 왼쪽 남은거 넣어주기
        for (j in leftIndex until leftArr.size) {
            originalArr[index] = leftArr[j]
            index++
        }

        // 오른쪽 남은거 넣어주기
        for (j in rightIndex until rightArr.size) {
            originalArr[index] = rightArr[j]
            index++
        }
    }
}