fun main(){

    val arr = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(2, 3, 4),
            arrayOf(3, 4, 5)
    )

    rotateMatrix(arr, 0, 0, 3)
}

fun rotateMatrix(arr: Array<Array<Int>>, x: Int, y: Int, n: Int) {

    val subMatrix = Array(n){IntArray(n)}

    for (i in x until x + n){
        for (j in y until y + n){
            subMatrix[i - (arr.size - n)][j - (arr.size - n)] = arr[i][j]
        }
    }

    for (k in subMatrix.indices){
        for (l in subMatrix.indices){
            print("${subMatrix[k][l]}")
        }
        println()
    }

    
}
