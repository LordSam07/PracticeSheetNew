fun main() {

    val arr = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(2, 3, 4),
            arrayOf(3, 4, 5)
    )

    getUniqueArray(arr)
}

fun getUniqueArray(arr: Array<Array<Int>>) {

    val newArr = ArrayList<Int>()

    for (i in arr.indices)
        for (j in arr[0].indices)
            if (arr[i][j] !in newArr)
                newArr.add(arr[i][j])

    for (k in newArr)
        print("$k ")
}
