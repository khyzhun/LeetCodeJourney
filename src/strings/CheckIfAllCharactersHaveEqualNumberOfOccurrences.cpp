#include <string>
#include <iostream>
#include <map>
using namespace std;

class Solution {
public:
    bool areOccurrencesEqual(string s) {
        map<char, int> frequency;
        for (char c : s) {
            frequency[c]++;
        }
        int firstFreqency = frequency.begin()->second;
        for (const auto& pair : frequency) {
            if (pair.second != firstFreqency) {
                return false;
            }
        }
        return true;
    }
};


int main() {
    bool result = Solution().areOccurrencesEqual("aaabb");
    cout << boolalpha << "result is: " << result << endl;
    return 0;
}
