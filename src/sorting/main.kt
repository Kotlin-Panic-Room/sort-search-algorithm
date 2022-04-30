package sorting




fun main(){
    val arr = mutableListOf(5,4,7,-1,8,30,3,2,1)
    val insertionSortArr = arr.toMutableList()
    InsertionSort().sort(insertionSortArr)
    val selectionSortArr = arr.toMutableList()
    SelectionSort().sort(selectionSortArr)
    val bubbleSortArr = arr.toMutableList()
    BubbleSort().sort(bubbleSortArr)
    val shellSortArr = arr.toMutableList()
    ShellSort().sort(shellSortArr)
}