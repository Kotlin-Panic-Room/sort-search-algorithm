package extention

import java.util.*

fun <T: Any> MutableList<T>.swap(idx:Int, idy:Int){
    val temp = this[idx]
    this[idx] = this[idy]
    this[idy] = temp
}