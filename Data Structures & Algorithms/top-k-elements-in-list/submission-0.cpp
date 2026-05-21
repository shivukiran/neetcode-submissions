class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
       unordered_map<int , int > count;

       for(int i = 0 ;i < nums.size(); i++)
       {

            count[nums[i]]++;

       } 

       //2 -> move map to vector to sort 

       vector<pair < int , int >> freq(count.begin() , count.end());

       // sort 

       sort(freq.begin() , freq.end() , 
       [](const pair <int , int > &a , const pair<int , int > &b){
       return a.second > b .second ;
       });

        // push it final result ;

        vector<int> result;
        for(int i = 0 ; i < k ; i++)
        {
            result.push_back(freq[i].first);
        }

            return result;
    }
};
