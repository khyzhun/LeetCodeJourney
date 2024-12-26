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

// O(n)
fun canCompleteCircuit2(gas: IntArray, cost: IntArray): Int {
    var total = 0
    var tank = 0
    var start = 0
    for (i in gas.indices) {
        val diff = gas[i] - cost[i]
        total += diff
        tank += diff
        if (tank < 0) {
            start = i + 1
            tank = 0
        }
    }

    return if (total >= 0) start else -1
}


fun main() {
    val result = canCompleteCircuit2(gas = intArrayOf(1,2,3,4,5), cost = intArrayOf(3,4,5,1,2))
    println(result)
}