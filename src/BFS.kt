class BFS {

    class Node(var left: Int, var right: Int)


    private val arr = ArrayList<Node>()
    private val bfs = ArrayList<Int>()

    private fun addNode(u :Int, v :Int){
        arr.add(Node(u , v))
    }

    private fun getBFS(start :Int){

        if (bfs.isEmpty()){
            bfs.add(start)
        }else{


        }
    }
}