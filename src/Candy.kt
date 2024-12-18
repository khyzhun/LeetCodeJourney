import kotlin.math.max

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 *
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 */
fun candy(ratings: IntArray): Int {
    val candies = IntArray(ratings.size) { 1 }
    var index = 1
    while (index < ratings.size) {
        if (ratings[index] > ratings[index - 1]) {
            candies[index] = candies[index - 1] + 1
        }
        index++
    }

    index = ratings.size - 1
    while (index > 0) {
        if (ratings[index - 1] > ratings[index]) {
            candies[index - 1] = max(candies[index - 1], candies[index] + 1)
        }
        index--
    }

    return candies.sum()
}