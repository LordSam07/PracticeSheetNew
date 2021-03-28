fun main(){

    val arr = arrayOf(
            arrayOf(1,2,3,4,5),
            arrayOf(6,7,8,9,10),
            arrayOf(11,12,13,14,15)
    )

    printWaveForm(arr)
}

fun printWaveForm(arr: Array<Array<Int>>) {
    val m = arr.size - 1
    val n = arr[0].size - 1
    var moveDown = true

    for ((counter, k) in (0..n).withIndex()){

        if (moveDown) {
            for (i in 0..m) {
                for (j in 0..n) {
                    if (j == counter)
                        print("${arr[i][j]} ")
                }
            }
            moveDown = false
        }else{
            for (i in m downTo 0) {
                for (j in 0..n) {
                    if (j == counter)
                        print("${arr[i][j]} ")
                }
            }
            moveDown = true
        }
    }
}
