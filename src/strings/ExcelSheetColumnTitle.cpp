#include <string>
#include <iostream>
#include <bitset>
using namespace std;

class Solution {
public: 
    string convertToTitle(int columnNumber) {
        string result; 
        while (columnNumber > 0) {
            columnNumber--;
            char letter = 'A' + (columnNumber % 26);
            result = letter + result;
            columnNumber /= 26;
        }
        return result;
    }
};


int main(int argc, char const *argv[]) {
    Solution solution;
    string result = solution.convertToTitle(28); // AB
    cout << result << endl;
    return 0;
}