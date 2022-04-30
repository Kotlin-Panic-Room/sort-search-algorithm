package sorting

import extention.swap

class ShellSort : SoringAlgorithm<MutableList<Int>> {

    init {
        println("Shell Sort is Starting \n" +
                "※ Worst case performance O(nlog2 2n) \n" +
                "※ Best case performance O(n log n) \n" +
                "※ Average case performance depends on gap sequence\n")
    }

    override fun sort(arr: MutableList<Int>) {

        var k = arr.size / 2

        while (k > 0) {
            // k 만큼 띄어져있는 원소들을 하나의 서브리스트로 보고 그안에서 정렬 -> k 의 숫자를 줄여나가며 서브리스의 갯수를 줄임
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