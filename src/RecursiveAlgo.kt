class RecursiveAlgo {

    fun towerOfHanoi(discs: Int, fromPeg: Char, toPeg: Char, auxPeg: Char) {

        if (discs == 1){
            println("Move dic 1 from $fromPeg to $toPeg")
            return
        }

        towerOfHanoi(discs - 1, fromPeg, auxPeg, toPeg)
        println("Move disc $discs From $fromPeg to $toPeg")
        towerOfHanoi(discs - 1, auxPeg, toPeg, fromPeg)
    }

    fun isArraySorted(arr: Array<Int>, n: Int) :Int{

        if(n == 1)
            return 1
        return if (arr[n - 1] < arr[n - 2]) {
            0
        }else{
            isArraySorted(arr, n - 1)
        }
    }

    fun factorial(n: Int) :Int{

        return if (n in 0..1)
            1
        else
            n * factorial(n - 1)
    }
}

fun main(){

    val obj = RecursiveAlgo()

    //obj.towerOfHanoi(6, 'X', 'Y', 'A')
    val result = obj.factorial(5)
    print(result)
}