/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun lowerBound(arr: MutableList<Int>, target: Int): Int{

    var left = 0
    var right = arr.size - 1


    while(left < right){
        val mid = left + (right-left) / 2
      
        when {
          target <= arr[mid] -> right = mid
          else -> left = mid  + 1
        }
    }

    return right

}

fun upperBound(arr: MutableList<Int>, target: Int): Int{

    var left = 0
    var right = arr.size - 1


    while(left < right){
        val mid = left + (right-left) / 2
      
        when {
          target < arr[mid] -> right = mid
          else -> left = mid  + 1
        }
    }

    return right

}



fun recursiveLowerBound(arr:MutableList<Int>, target: Int, left: Int, right: Int): Int{

    if (left >= right) return left
    val mid = left + (right - left) / 2
    
    if(target <= arr[mid]){
        return recursiveLowerBound(arr,target,left,mid)
    } else {
		return recursiveLowerBound(arr,target,mid + 1,right)
    }
}

tailrec fun binarySearch(arr: MutableList<Int>, left: Int, right: Int, target: Int): Int{
    if (left > right) return -1
    
    val mid = left + (right - left) /2
    
    println("mid = $mid value = ${arr[mid]}")
    
    return when {
        target < arr[mid] -> binarySearch(arr,left,mid,target)
        target > arr[mid] -> binarySearch(arr,mid+1,right,target)
        else -> mid
    }
    
}

fun main() {
    val arr = mutableListOf(1,2,4,5,7,8,9,11)
    println(lowerBound(arr, 8))
    println(upperBound(arr, 13))
    println(binarySearch(arr,0,arr.size -1,11))
    
    println(recursiveLowerBound(arr, 8, 0, arr.size - 1))
}
