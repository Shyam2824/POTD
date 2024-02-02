public class implementAltio {
    class Solution
{
    int atoi(String s) {
	// Your code here
	boolean negative = false;
	int result=0;
	int i=0;
	if(s.charAt(0)=='-'){
	    negative = true;
	    i++;
	}
	
	while(i<s.length()){
	    if(s.charAt(i)>='0' && s.charAt(i)<='9'){
	        result = (result*10)+Character.getNumericValue(s.charAt(i));
	    }else{
	        return -1;
	    }
	    i++;
	}
	
	return negative==true?-result:result;
    }
}
}
