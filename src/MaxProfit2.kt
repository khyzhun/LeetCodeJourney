/**
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 */
fun maxProfit2(prices: IntArray): Int {
    var profit = 0
    var buy = prices[0]
    var sold = false
    for (i in 0 until prices.size - 1) {
        if (sold) {
            buy = prices[i]
            sold = false
            continue
        }
        if (prices[i] > buy) {
            profit += prices[i] - buy
            sold = true
        } else {
            buy = prices[i]
        }
    }
    return profit
}