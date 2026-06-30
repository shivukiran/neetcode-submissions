class Solution {
public:
    bool isValid(string s) {
        
        stack<char>st;

        int i = 0 ;
        int sz = s.size();


        while(i < sz)
        {
            if(st.empty())
            {
                st.push(s[i]);
                i++;
            }

            if(s[i] == '(' || s[i] == '{' || s[i]=='[')
            {
                st.push(s[i]);
                i++;
            }
            else
            {
                if(s[i] == ']' && st.top() == '[' || s[i] == '}' && st.top() == '{'
                    || s[i] == ')' && st.top() == '(' )
                {
                    st.pop();
                    i++;
                }
                else
                {
                    return false;
                }
            }
        }
        if(!st.empty())
        {
            return false;
        }
        else
        return true;
    }
};
