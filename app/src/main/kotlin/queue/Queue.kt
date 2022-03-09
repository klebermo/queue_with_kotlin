package queue

class Node<T>(var data: T, var next: Node<T>? = null, var previous: Node<T>? = null) {}

class Queue<T>(var begin: Node<T>? = null, var end: Node<T>? = null) {
    fun queue(value: T) {
        var aux = begin
        var auxPrevious: Node<T>? = null

        if(begin == null) {
            begin = Node(value)
        } else {
            while(aux != null) {
                auxPrevious = aux
                aux = aux.next
            }
            aux = Node(value)
            aux.previous = auxPrevious
            auxPrevious?.next = aux
            end = aux
        }
    }
    fun dequeue(): T? {
        if(begin == null) {
            return null
        } else {
            val aux = begin
            val auxPrevious = begin?.next

            auxPrevious?.previous = null
            begin?.next = null
            begin = auxPrevious

            return aux?.data
        }
    }
}
