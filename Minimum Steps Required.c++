int minSteps(string str) {
    // Write your code here.
       int ca=0,cb=0;
    str+='#';
    int n=str.length();
    for(int i=0;i<n;i++){
       
        if(str[i]=='a' and str[i+1]!='a')ca++;
        if(str[i]=='b' and str[i+1]!='b')cb++;
    }
    int ans=min(ca,cb)+1;
    return ans;
}