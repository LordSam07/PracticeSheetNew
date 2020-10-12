import jdk.nashorn.internal.objects.NativeArray.indexOf

fun main(){

    val outputArray = stockSummary(arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"), arrayOf("A", "B", "C", "D"))

    for (v in outputArray){
        if (outputArray.indexOf(v) == 0){
            print("$v ")
        }else{
            print("- $v ")
        }
    }
}

fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): ArrayList<String> {

    val outputArray = ArrayList<String>()
    var count = 0

    for ( c in lstOfCat ){
        for ( s in lstOfArt){

            if (c == "${s[0]}"){
                val temp = s.split(" ")
                count += temp[1].toInt()
            }
        }

        if (count != 0){
            outputArray.add("($c : $count)")
        }
        count = 0
    }

   return outputArray

}