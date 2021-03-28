class TicTacToe {

    var isGameOn = false
    var isPlayer1 = false
    var isPlayer2 = false

    var player1Moves = ArrayList<Int>()
    var player2Moves = ArrayList<Int>()

    var index = 0

    private var board = arrayOf(
                    arrayOf('-', '-', '-'),
                    arrayOf('-', '-', '-'),
                    arrayOf('-', '-', '-')
                    )

    private fun printBoard(){

        println("___Board___")
        for (i in board.indices){
            for (j in board.indices){
                print("  ${board[i][j]}")
            }
            println()
        }
        println("_TicTacToe_")
    }

    private fun checkTurn(whoGoesFirst :Int){

        println("Game Starts...")
        printBoard()
        println()

        if (whoGoesFirst == 1) {

            isPlayer1 = true
            println("Player 1 moves first!")

        }else {

            isPlayer2 = true
            println("Player 2 moves first")
        }
    }

    fun play(whoGoesFirst :Int){

        isGameOn = true

        checkTurn(whoGoesFirst)

        do {

            if (isPlayer1){
                println("Player 1's turn")
                println("Choose an index between 1-9")
                index = readLine()!!.toInt()
                move(1, index)
            }else{
                println("Player 2,s turn")
                println("Choose an index between 1-9")
                index = readLine()!!.toInt()
                move(2, index)
            }

            printBoard()

        }while (isGameOn)

        println("Do you wanna play again(y/n)?")
        if (readLine()!! == "y"){
            isGameOn= true
            play(whoGoesFirst)
        }else{
            println("Thanks for playing!")
        }
    }

    private fun move(player :Int, index :Int){

        var i = 0
        var j = 0

        when(index){

            1 -> {
                i = 0
                j = 0
            }

            2 -> {
                i = 0
                j = 1
            }
            3 -> {
                i = 0
                j = 2
            }
            4 -> {
                i = 1
                j = 0
            }
            5 -> {
                i = 1
                j = 1
            }
            6 -> {
                i = 1
                j = 2
            }
            7 -> {
                i = 2
                j = 0
            }
            8 -> {
                i = 2
                j = 1
            }
            9 -> {
                i = 2
                j = 2
            }
        }

        if (player1Moves.contains(index) || player2Moves.contains(index)){

            println("Invalid Moves!")
            return
        }
        else if (index !in 1..9){

            println("Invalid Index!")
            return
        } else{

            if (player == 1) {

                player1Moves.add(index)
                board[i][j] = 'X'
                isPlayer1 = false
                isPlayer2 = true
            }else{

                player2Moves.add(index)
                board[i][j] = '0'
                isPlayer1 = true
                isPlayer2 = false
            }
        }
        checkWinner()
    }

    private fun checkWinner(){

        if (player1Moves.size + player2Moves.size == 9){
            println("Draw!")
            reset()
        }else{
            
            //for player 1
            //row 1    
            if (player1Moves.contains(1) && player1Moves.contains(2) && player1Moves.contains(3)){
                println("Player 1 Wins!")
                reset()
            }
            //row 2
            if (player1Moves.contains(4) && player1Moves.contains(5) && player1Moves.contains(6)){
                println("Player 1 Wins!")
                reset()
            }
            //row 3
            if (player1Moves.contains(7) && player1Moves.contains(8) && player1Moves.contains(9)){
                println("Player 1 Wins!")
                reset()
            }
            //col 1    
            if (player1Moves.contains(1) && player1Moves.contains(4) && player1Moves.contains(7)){
                println("Player 1 Wins!")
                reset()
            }
            //col 2
            if (player1Moves.contains(2) && player1Moves.contains(5) && player1Moves.contains(8)){
                println("Player 1 Wins!")
                reset()
            }
            //col3 3
            if (player1Moves.contains(3) && player1Moves.contains(6) && player1Moves.contains(9)){
                println("Player 1 Wins!")
                reset()
            }
            //d 1
            if (player1Moves.contains(1) && player1Moves.contains(5) && player1Moves.contains(9)){
                println("Player 1 Wins!")
                reset()
            }
            //d 2
            if (player1Moves.contains(3) && player1Moves.contains(5) && player1Moves.contains(7)){
                println("Player 1 Wins!")
                reset()
            }

            //for player 2
            //row 1    
            if (player2Moves.contains(1) && player2Moves.contains(2) && player2Moves.contains(3)){
                println("Player 2 Wins!")
                reset()
            }
            //row 2
            if (player2Moves.contains(4) && player2Moves.contains(5) && player2Moves.contains(6)){
                println("Player 2 Wins!")
                reset()
            }
            //row 3
            if (player2Moves.contains(7) && player2Moves.contains(8) && player2Moves.contains(9)){
                println("Player 2 Wins!")
                reset()
            }
            //col 1    
            if (player2Moves.contains(1) && player2Moves.contains(4) && player2Moves.contains(7)){
                println("Player 2 Wins!")
                reset()
            }
            //col 2
            if (player2Moves.contains(2) && player2Moves.contains(5) && player2Moves.contains(8)){
                println("Player 2 Wins!")
                reset()
            }
            //col3 3
            if (player2Moves.contains(3) && player2Moves.contains(6) && player2Moves.contains(9)){
                println("Player 2 Wins!")
                reset()
            }
            //d 1
            if (player2Moves.contains(1) && player2Moves.contains(5) && player2Moves.contains(9)){
                println("Player 2 Wins!")
                reset()
            }
            //d 2
            if (player2Moves.contains(3) && player2Moves.contains(5) && player2Moves.contains(7)){
                println("Player 2 Wins!")
                reset()
            }
        }
    }

    private fun reset(){
        index  = 0
        isGameOn = false
        isPlayer1 = false
        isPlayer2 = false
        player1Moves.clear()
        player2Moves.clear()

        board = arrayOf(
                arrayOf('-', '-', '-'),
                arrayOf('-', '-', '-'),
                arrayOf('-', '-', '-')
        )
    }

}

fun main(){

    val obj = TicTacToe()
    obj.play(1)
}