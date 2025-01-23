package linked_list

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
fun hasCycle1(head: ListNode?): Boolean {
    if (head?.next == null) return false
    val set = HashSet<ListNode>()
    var current = head
    while (current != null) {
        if (set.contains(current)) return true
        set.add(current)
        current = current.next
    }
    return false
}

fun hasCycle2(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) {
            return true
        }
    }
    return false
}

fun main() {
    println(hasCycle1(ListNode(1)))
    println(hasCycle2(ListNode(1)))
}
