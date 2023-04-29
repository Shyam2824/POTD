 long long ans=0, num=1;
        while(N){
            if(N%5==0){
                ans+=9*num;
                N=N/5-1;
            }
            else if(N%5==1){
                ans+=1*num;
                N/=5;
            }
            else if(N%5==2){
                ans+=3*num;
                N/=5;
            }
            else if(N%5==3){
                ans+=5*num;
                N/=5;
            }
            else if(N%5==4){
                ans+=7*num;
                N/=5;
            }
            
            num*=10;
        }
        return ans;