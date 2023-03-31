class Solution
{
    public:
        vector <int> lexicographicallyLargest(vector <int> &a,int n)
        {
            // Code here
              vector<int>v;
                vector<int>w;
            vector<vector<int>>ans;
            int prev;
            if(a[0]%2==0)
            {
            prev=0;
            }
            else
            {
               prev=1; 
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==0)
                {
                    if(prev==1)
                    {
                        sort(w.begin(),w.end());
            reverse(w.begin(),w.end());
                        ans.push_back(w);
                        w.clear();
                    w.push_back(a[i]);
                    prev=0;
                    }
                    else
                    {
                    w.push_back(a[i]);
                    prev=0;
                    }

                }
                else
                {
                    if(prev==0)
                    {
                        sort(w.begin(),w.end());
            reverse(w.begin(),w.end());
                        ans.push_back(w);
                        w.clear();
                    w.push_back(a[i]);
                    prev=1;
                    }
                    else
                    {
                    w.push_back(a[i]);
                    prev=1;
                    }

                }

            }
            if(!w.empty())
           {
            sort(w.begin(),w.end());
            reverse(w.begin(),w.end());
            ans.push_back(w);               
            }

            for(auto i:ans)
            {
                for(auto j:i)
                {
                    v.push_back(j);
                }
            }
            return v;

        }
};