// O(n^2)
fun canCompleteCircuit1(gas: IntArray, cost: IntArray): Int {
    val n = gas.size
    var tank: Int
    var answer = -1

    outer@ for (i in 0 until n) {
        tank = 0
        var j = i
        for (step in 0 until n) {
            tank += gas[j] - cost[j]
            j = (j + 1) % n
            if (tank < 0) continue@outer
            if (step == n - 1) {
                answer = i
                break@outer
            }
        }
    }

    return answer
}

fun main() {
    val result = canCompleteCircuit1(gas = intArrayOf(1,2,3,4,5), cost = intArrayOf(3,4,5,1,2))
    println(result)
}