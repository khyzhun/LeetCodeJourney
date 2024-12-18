import kotlin.math.max

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var buy = prices[0]
    for (i in prices.indices) {
        if (prices[i] > buy) {
            profit = max(profit, prices[i] - buy)
        } else {
            buy = prices[i]
        }
    }
    return profit
}