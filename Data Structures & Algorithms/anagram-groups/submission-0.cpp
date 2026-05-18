class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<string ,vector<string>>ans;
        vector<vector<string>>final;
        for(int i = 0 ; i < strs.size() ;i++)
        {
            string sorts = strs[i];
            sort(sorts.begin() , sorts.end());
            ans[sorts].push_back(strs[i]);
        } 

        for(auto i : ans)
        {
                final.push_back(i.second);
        }

        return final;

    }
};
