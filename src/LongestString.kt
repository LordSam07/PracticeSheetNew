fun main(){

    val strArr = arrayOf("ab", "ab", "bc", "bc", "cd", "cd")

    getLongestString(strArr.sortedArray())
}

fun getLongestString(strArr: Array<String>) {

    var firstEntry = strArr[0]

    for (i in 1 until strArr.size){
        val temp = strArr[i - 1][1]

        if (strArr[i][0] == temp)
            firstEntry += strArr[i][1]
    }
    println(firstEntry)
}
