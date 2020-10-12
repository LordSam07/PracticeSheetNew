import java.lang.NullPointerException
import java.util.*

class BinaryTree {

    var root: Node? = null

    inner class Node(val value: Any?) {
        var lChild: Node? = null
        var rChild: Node? = null
    }

    fun createNode(value: Any?): Node {

        return Node(value)
    }

    fun addRoot(value: Any?) {

        val n = createNode(value)
        this.root = n
    }

    fun addOnLeft(value: Any?) {

        val n = createNode(value)
        if (root!!.lChild == null) {
            root!!.lChild = n
        }else{
            var ref = root
            while (ref!!.lChild != null){
                ref = ref.lChild
            }
            ref.lChild = n
        }
    }

    fun addOnRight(value: Any?) {

        val n = createNode(value)
        if (root!!.rChild == null) {
            root!!.rChild = n
        }else{
            var ref = root
            while (ref!!.rChild != null){
                ref = ref.rChild
            }
            ref.rChild = n
        }
    }

    fun printTree(){
        printPreOrder(root)
    }

    private fun printPreOrder(node: Node?) {

        val ll = LinkedList<Int>()
        if (node == null)
            return

        try {
            print("${node.value} ")
            printPreOrder(node.lChild!!)
            printPreOrder(node.rChild!!)
        }catch (ex :NullPointerException){
            return
        }
    }
}