package sorting

import extention.swap

class HeapSort : SoringAlgorithm<MutableList<Int>> {
    init {
        println("Merge Sort is Starting \n" +
                "※The performance of this algorithm is O(n log n) \n")
    }


    override fun sort(arr: MutableList<Int>) {

        var heapSize = arr.size - 1
        buildMaxHeap(arr) // 맥스힙 만들기
        for (index in heapSize downTo 1) {
            arr.swap(0, index)  // maxHeap이므로 가장 끝 원소는 가장 작은 원소임
            heapSize-- // 이미 정렬된 인덱스 뺴기
            maxHeapify(arr, 0, heapSize) // 스왑된 가장 작은 원소 다시 자식노드로 내려주기
        }
        println(arr.toString())
    }

    private fun buildMaxHeap(arr: MutableList<Int>) {
        // 힙을 만들때는
        // 인덱스는 배열의 사이즈 부터 시작해 나감
        for (index in arr.size - 1 downTo 0) {
            maxHeapify(arr, index, arr.size - 1)
            println("index = $index")
            println("arr is ${arr}")
        }
        println("maxHeap is ${arr}")
    }

    private fun maxHeapify(arr: MutableList<Int>, start: Int, size: Int) {
        // 왼쪽 인덱스, 오른쪽 인덱스, 가장 큰 인덱스의 기본 값은 스타트
        val leftElementIndex = start * 2 + 1
        val rightElementIndex = start * 2 + 2
        var maxElementIndex = start

        // 왼쪽 자식노드가 사이즈 안에 들어오고 자식 원소가 자신 보다 크다면 maxIndex는 왼쪽 자식 노드
        if ((leftElementIndex <= size) && (arr[leftElementIndex] > arr[start])) {
            maxElementIndex = leftElementIndex;
        }

        // 오른족 자식노드가 사이즈 안에 들어오고 자식 원소가 앞서 본 maxIndex(왼쪽,혹은 자기 자신) 보다 크다면 maxIndex는 오른쪽 자식 노드
        if ((rightElementIndex <= size) && (arr[rightElementIndex] > arr[maxElementIndex])) {
            maxElementIndex = rightElementIndex;
        }

        // maxIndex가 바뀌었다면 스왑을 해주고 더 밑으로 내려가서 찾아봄
        if (maxElementIndex != start) {
            arr.swap(start, maxElementIndex)
            maxHeapify(arr, maxElementIndex, size);
        }
    }
}