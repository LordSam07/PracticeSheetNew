class CircularDoublyLinkedList {

    private var head: CDNode? = null
    private var tail: CDNode? = null

    val size: Int
        get() {
            var cn = head
            var count = 0
            while (cn!!.next != head){
                count++
                cn = cn.next
            }
            count++
            return count
        }


    fun addPrev(data: String){
        val newNode = CDNode(null, data, null)

        if (head == null){
            head = newNode
            tail = newNode
            return
        }

        head!!.prev = newNode
        newNode.next = head
        head = newNode
        head!!.prev = tail
        tail!!.next = head
    }
}

class CDNode(var prev: CDNode?, val data: String, var next: CDNode?)

fun main() {

    val list = CircularDoublyLinkedList()

}