package linked_list

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var p1 = l1
    var p2 = l2
    var carry = 0
    val dummyHead = ListNode(0)
    var current = dummyHead

    while (p1 != null || p2 != null || carry != 0) {
        val x = p1?.`val` ?: 0
        val y = p2?.`val` ?: 0

        val sum = x + y + carry
        carry = sum / 10
        current.next = ListNode(sum % 10)

        current = current.next!!
        p1 = p1?.next
        p2 = p2?.next
    }

    return dummyHead.next
}

private fun toListNode(values: List<Int>): ListNode? {
    val dummy = ListNode(0)
    var current = dummy
    for (value in values) {
        current.next = ListNode(value)
        current = current.next!!
    }
    return dummy.next
}

fun main() {
    val l1 = toListNode(listOf(2, 4, 3))
    val l2 = toListNode(listOf(5, 6, 4))
    println(addTwoNumbers(l1, l2))
}