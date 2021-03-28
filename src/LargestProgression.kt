fun main(){

    val t = 10
    val s = "12201121234"
    var str = ""
    val arr = ArrayList<Int>()

    for (i in 0 until 10){

        if (s[i].toInt() <= s[i + 1].toInt()){
            str += s[i]
        }else{
            str += s[i]
            arr.add(str.toInt())
            str = ""
        }
    }

    for (i in arr){
        println(i)
    }

    println(arr.max())
}