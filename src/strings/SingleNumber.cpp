#include <vector>
#include <iostream>
using namespace std;

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
};

int main(int argc, char const *argv[]) {
    Solution sol; 
    vector<int> nums = {4, 1, 2, 1, 2};
    cout << sol.singleNumber(nums) << endl;
    return 0;
}
