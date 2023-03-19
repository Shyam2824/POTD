    unordered_map<int, int> mp1;

        unordered_map<int, int> mp2;

        vector<int> ans(N, 0);

        

        for(int i=1; i<N; i++){

            mp1[A[i]]++;

        }

        

        ans[0] = 0-mp1.size();

        

        for(int i=1; i<N; i++){

            mp2[A[i-1]]++;

            mp1[A[i]]--;

            if(mp1[A[i]] <= 0)

                mp1.erase(A[i]);

            

            ans[i] = mp2.size()-mp1.size();

        }

        return ans;