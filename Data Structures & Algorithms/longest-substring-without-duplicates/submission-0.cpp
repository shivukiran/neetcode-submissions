class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char>check;

        int l = 0 ;
        int r = 0 ;
        int size = s.size();
        int len = 0;
        if(size <= 1 )
        {
            return size ;
        }
        while(r < size)
        {

            if(check.empty())
            {
                check.insert(s[r]);
                r++;
            }

            if(check.find(s[r]) != check.end())
            {
                while(check.find(s[r]) != check.end())
                {
                    check.erase(s[l]);
                    l++;
                }
                check.insert(s[r]);
                r++;
            }
            else{
                check.insert(s[r]);
                r++;
            }

             len = max(len , r - l );

        }
        return len;
    }
};
