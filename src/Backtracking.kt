class Backtracking {


    fun binary(arr: Array<Int>, n: Int){

        if (n < 1)
            print("${arr[n]}")
        else{
            arr[n - 1] = 0
            binary(arr, n- 1)
            arr[n - 1] = 1
            binary(arr, n - 1)
        }
    }
}

fun main(){

    val obj = Backtracking()
    obj.binary(arrayOf(1, 2, 3, 4, 5), 5)
}