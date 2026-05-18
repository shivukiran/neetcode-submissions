class Solution {
public:
    bool isAnagram(string s, string t) {
        
        if(s.size() != t.size())
        {
            return false;
        }
        unordered_map<char , int >check;
        unordered_map<char , int > s2;

        for(int i = 0 ; i < s.size(); i++)
        {
            check[s[i]]++;
            s2[t[i]]++;
        }

        return check==s2;


    }
};
