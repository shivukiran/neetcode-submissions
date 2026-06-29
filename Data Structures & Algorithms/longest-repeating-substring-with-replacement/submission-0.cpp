class Solution {
public:
    int characterReplacement(string s, int k) {

        int l = 0;
        int r = 0;
        int maxWind = 0;
        unordered_map<char, int> count;

        while (r < s.size()) {

            // Add current character
            count[s[r]]++;

            // Find max frequency in current window
            int maxCharInWind = 0;
            for (auto &it : count) {
                maxCharInWind = max(maxCharInWind, it.second);
            }

            int windLen = r - l + 1;

            // Shrink window until it becomes valid
            while (windLen - maxCharInWind > k) {
                count[s[l]]--;

                if (count[s[l]] == 0)
                    count.erase(s[l]);

                l++;

                // Recalculate values after shrinking
                windLen = r - l + 1;
                maxCharInWind = 0;
                for (auto &it : count) {
                    maxCharInWind = max(maxCharInWind, it.second);
                }
            }

            // Update answer
            maxWind = max(maxWind, windLen);

            // Expand window
            r++;
        }

        return maxWind;
    }
};