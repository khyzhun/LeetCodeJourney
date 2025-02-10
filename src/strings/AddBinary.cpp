#include <string>
#include <iostream>
#include <bitset>
using namespace std;

class Solution {
public: 
    string addBinary(string a, string b) {
        string result = "";
        int i = a.size() - 1; 
        int j = b.size() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;
            if (i >= 0) sum += a[i--] - '0';
            if (j >= 0) sum += b[j--] - '0';
            result += (sum % 2) + '0';
            carry = sum / 2;
        }
        reverse(result.begin(), result.end());
        return result;
    }
};

int main() {
    Solution sol;
    sol.addBinary("11", "1");
    return 0;
}