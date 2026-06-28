class Solution {
public:
    int lengthOfLongestSubstring(string s) {


        unordered_set<char> check;

        int l = 0;
        int r = 0;
        int ans = 0;

        while (r < s.size()) {

            while (check.find(s[r]) != check.end()) {
                check.erase(s[l]);
                l++;
            }

            check.insert(s[r]);
            ans = max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
};
    

