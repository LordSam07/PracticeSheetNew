class Data(val manhattanDistance: Int,val puzzle: Array<Array<Int>>)

class EightPuzzle {

    val GOAL_STATE = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4 , 5, 6),
            arrayOf(7, 8, 0)
    )

    var MANHATTAN_DISTANCE = -1

    fun solve(puzzle: Array<Array<Int>>){

        val puzzles = arrayOf(puzzle, puzzle, puzzle, puzzle)
        val leftObj: Data
        val rightObj: Data
        val upObj: Data
        val downObj: Data

        //first run
        MANHATTAN_DISTANCE += calculateManhattanDistance(puzzle)

        if (checkGoalState(puzzle)){
            println("Manhattan distance = $MANHATTAN_DISTANCE")
        }else{

            upObj = playUp(puzzles[2])
            println(upObj.manhattanDistance)
            printPuzzle(upObj.puzzle)

            downObj = playDown(puzzles[3])
            println(downObj.manhattanDistance)
            printPuzzle(downObj.puzzle)

            leftObj = playLeft(puzzles[0])
            println(leftObj.manhattanDistance)
            printPuzzle(leftObj.puzzle)

            rightObj = playRight(puzzles[1])
            println(rightObj.manhattanDistance)
            printPuzzle(rightObj.puzzle)


//            if (
//                leftObj.manhattanDistance <= rightObj.manhattanDistance &&
//                leftObj.manhattanDistance <= upObj.manhattanDistance &&
//                leftObj.manhattanDistance <= downObj.manhattanDistance
//                    ){
//                MANHATTAN_DISTANCE += leftObj.manhattanDistance
//                printPuzzle(leftObj.puzzle)
//                solve(leftObj.puzzle)
//            }else if (
//                    rightObj.manhattanDistance <= leftObj.manhattanDistance &&
//                    rightObj.manhattanDistance <= upObj.manhattanDistance &&
//                    rightObj.manhattanDistance <= downObj.manhattanDistance
//            ){
//                MANHATTAN_DISTANCE += rightObj.manhattanDistance
//                printPuzzle(rightObj.puzzle)
//                solve(rightObj.puzzle)
//            }else if (
//                    upObj.manhattanDistance <= leftObj.manhattanDistance &&
//                    upObj.manhattanDistance <= rightObj.manhattanDistance &&
//                    upObj.manhattanDistance <= downObj.manhattanDistance
//            ){
//                MANHATTAN_DISTANCE += rightObj.manhattanDistance
//                printPuzzle(rightObj.puzzle)
//                solve(rightObj.puzzle)
//            }else{
//                MANHATTAN_DISTANCE += rightObj.manhattanDistance
//                printPuzzle(rightObj.puzzle)
//                solve(rightObj.puzzle)
//            }
        }
    }


    private fun playLeft(puzzle: Array<Array<Int>>) :Data{

        var d: Int
        val temp: Int
        var indexOfZeroI = 0
        var indexOfZeroJ = 0

        for (i in puzzle.indices)
            for (j in puzzle.indices)
                if (puzzle[i][j] == 0) {
                    indexOfZeroI = i
                    indexOfZeroJ = j
                }

        //swap
        try {
            temp = puzzle[indexOfZeroI][indexOfZeroJ]
            puzzle[indexOfZeroI][indexOfZeroJ] = puzzle[indexOfZeroI][indexOfZeroJ + 1]
            puzzle[indexOfZeroI][indexOfZeroJ + 1] = temp

            d = calculateManhattanDistance(puzzle)
        }catch (ex :IndexOutOfBoundsException){
            d = 9
        }


        return Data(d, puzzle)
    }

    private fun playRight(puzzle: Array<Array<Int>>) :Data{
        var d: Int
        val temp: Int
        var indexOfZeroI = 0
        var indexOfZeroJ = 0

        for (i in puzzle.indices)
            for (j in puzzle.indices)
                if (puzzle[i][j] == 0) {
                    indexOfZeroI = i
                    indexOfZeroJ = j
                }

        //swap
        try {
            temp = puzzle[indexOfZeroI][indexOfZeroJ]
            puzzle[indexOfZeroI][indexOfZeroJ] = puzzle[indexOfZeroI][indexOfZeroJ - 1]
            puzzle[indexOfZeroI][indexOfZeroJ - 1] = temp

            d = calculateManhattanDistance(puzzle)
        }catch (ex :IndexOutOfBoundsException){
            d = 9
        }


        return Data(d, puzzle)
    }

    private fun playUp(puzzle: Array<Array<Int>>) :Data{
        var d: Int
        val temp: Int
        var indexOfZeroI = 0
        var indexOfZeroJ = 0

        for (i in puzzle.indices)
            for (j in puzzle.indices)
                if (puzzle[i][j] == 0) {
                    indexOfZeroI = i
                    indexOfZeroJ = j
                }

        //swap
        try {
            temp = puzzle[indexOfZeroI][indexOfZeroJ]
            puzzle[indexOfZeroI][indexOfZeroJ] = puzzle[indexOfZeroI + 1][indexOfZeroJ]
            puzzle[indexOfZeroI + 1][indexOfZeroJ] = temp

            d = calculateManhattanDistance(puzzle)
        }catch (ex :IndexOutOfBoundsException){
            d = 9
        }


        return Data(d, puzzle)
    }

    private fun playDown(puzzle: Array<Array<Int>>) :Data{
        var d: Int
        val temp: Int
        var indexOfZeroI = 0
        var indexOfZeroJ = 0

        for (i in puzzle.indices)
            for (j in puzzle.indices)
                if (puzzle[i][j] == 0) {
                    indexOfZeroI = i
                    indexOfZeroJ = j
                }

        //swap
        try {
            temp = puzzle[indexOfZeroI][indexOfZeroJ]
            puzzle[indexOfZeroI][indexOfZeroJ] = puzzle[indexOfZeroI - 1][indexOfZeroJ]
            puzzle[indexOfZeroI - 1][indexOfZeroJ] = temp

            d = calculateManhattanDistance(puzzle)
        }catch (ex :IndexOutOfBoundsException){
            d = 9
        }


        return Data(d, puzzle)
    }

    private fun calculateManhattanDistance(puzzle: Array<Array<Int>>) :Int{

        var count = 0

        if (puzzle[0][0] != GOAL_STATE[0][0])
            count++
        if (puzzle[0][1] != GOAL_STATE[0][1])
            count++
        if (puzzle[0][2] != GOAL_STATE[0][2])
            count++
        if (puzzle[1][0] != GOAL_STATE[1][0])
            count++
        if (puzzle[1][1] != GOAL_STATE[1][1])
            count++
        if (puzzle[1][2] != GOAL_STATE[1][2])
            count++
        if (puzzle[2][0] != GOAL_STATE[2][0])
            count++
        if (puzzle[2][1] != GOAL_STATE[2][1])
            count++
        if (puzzle[2][2] != GOAL_STATE[2][2])
            count++

        return count / 2
    }

    private fun checkGoalState(puzzle: Array<Array<Int>>) :Boolean{

        return (
                puzzle[0][0] == GOAL_STATE[0][0] &&
                puzzle[0][1] == GOAL_STATE[0][1] &&
                puzzle[0][2] == GOAL_STATE[0][2] &&
                puzzle[1][0] == GOAL_STATE[1][0] &&
                puzzle[1][1] == GOAL_STATE[1][1] &&
                puzzle[1][2] == GOAL_STATE[1][2] &&
                puzzle[2][0] == GOAL_STATE[2][0] &&
                puzzle[2][1] == GOAL_STATE[2][1] &&
                puzzle[2][2] == GOAL_STATE[2][2]
                )
    }
}

private fun printPuzzle(puzzle: Array<Array<Int>>){

    for (i in puzzle.indices){
        for (j in puzzle.indices){
            print("${puzzle[i][j]} ")
        }
        println()
    }

    println()
    println()
}

fun main(){
    val puzzle = arrayOf(arrayOf(1, 2, 3),
                        arrayOf(4 , 5, 6),
                        arrayOf(7, 0, 8))
    val obj = EightPuzzle()
    obj.solve(puzzle)
}