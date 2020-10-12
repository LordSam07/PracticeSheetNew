class AdjacencyMatrix {

    fun getMatrix(graph: Array<Array<Int>>) {

        val nodesArray = getNodes(graph)
        val adjacencyMatrix = Array(nodesArray.size){Array(nodesArray.size){0}}

        //making matrix

       for (u in 0 until nodesArray.size)
           for (v in 0 until nodesArray.size)
               for (edge in graph)
                   if ((edge[0] == u) && (edge[1] == v) || (edge[0] == v) && (edge[1] == u))
                   adjacencyMatrix[u][v] = 1

        printMatrix(adjacencyMatrix)

    }

    private fun getNodes(graph: Array<Array<Int>>) :ArrayList<Int>{

        val nodeArray = ArrayList<Int>()

        for (edge in graph)
            for (node in edge)
                if (!nodeArray.contains(node))
                    nodeArray.add(node)

        nodeArray.sort()
        return nodeArray
    }

    private fun printMatrix(adjacencyMatrix :Array<Array<Int>>){

        for (array in adjacencyMatrix){
            for (j in array){
                print("$j ")
            }
            println()
        }
    }
}