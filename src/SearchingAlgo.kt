import kotlin.math.sqrt

class SearchingAlgo {

    fun linearSearch(arr: Array<Int>, n: Int) {
        for (i in arr.indices) {
            if (n == arr[i]) {
                println(i)
                return
            }
        }
        println("index not found in array")
    }

    fun binarySearch(arr: Array<Int>, low: Int, upper: Int, n: Int) {
        val mid: Int = (low + upper) / 2

        when {
            n == arr[mid] -> {
                println(mid)
                return
            }
            n > arr[mid] -> {
                binarySearch(arr, mid + 1, upper, n)
            }
            else -> {
                binarySearch(arr, low, mid, n)
            }
        }
    }

    fun jumpSearch(arr: Array<Int>, n: Int){
        val jump = sqrt((arr.size/2).toDouble()).toInt()
        for (i in arr.indices step jump ){
            if(n == arr[i]){
                println(i)
                return
            }
            else{
                if (arr[i] > n){
                    val step = i - jump
                    for (j in step until arr.size){
                        if(arr[j] == n)
                        {
                            println(j)
                            return
                        }
                    }
                }
            }
        }
        println("Not Found")
    }


}

fun main() {

    val obj = SearchingAlgo()
    obj.jumpSearch(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 6)
}