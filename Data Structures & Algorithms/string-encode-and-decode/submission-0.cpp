class Solution {
public:

    string encode(vector<string>& strs) {

            //encode 

            string ans = "";
            for(string &s : strs)
            {
                ans+= to_string(s.size() )+ "!"+ s;
            }

            return ans;
    }

    vector<string> decode(string s) {

            vector<string>finalAns;

            int i = 0;

            while(i < s.size())
            {
                int j = i ;

                //move j till u find and !
                while(s[j] != '!')j++;

                int len = stoi(s.substr(i , j - i ));
                finalAns.push_back(s.substr(j + 1 , len));

                i = j+len +1;
            }

            return finalAns;
    }
};
