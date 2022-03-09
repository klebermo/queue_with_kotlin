package queue

fun main() {
    val queue = Queue<Int>()

    queue.queue(1)
    queue.queue(2)
    queue.queue(3)
    queue.queue(4)
    queue.queue(5)
    queue.queue(6)

    print("{")
    print(queue.dequeue() ?: 0)
    print(", ")
    print(queue.dequeue() ?: 0)
    print(", ")
    print(queue.dequeue() ?: 0)
    print(", ")
    print(queue.dequeue() ?: 0)
    print(", ")
    print(queue.dequeue() ?: 0)
    print(", ")
    print(queue.dequeue() ?: 0)
    print("}")
}
