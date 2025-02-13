using namespace std;
#include <vector>
#include <iostream>


class Solution {
public: 
    int searchInsert(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return left;
    }
};

int main() {
    Solution solution = Solution();
    vector<int> nums = {1, 3, 5, 6};
    cout << solution.searchInsert(nums, 5) << endl; // Output: 2
    cout << solution.searchInsert(nums, 2) << endl; // Output: 1
    cout << solution.searchInsert(nums, 7) << endl; // Output: 4
    return 0;
}