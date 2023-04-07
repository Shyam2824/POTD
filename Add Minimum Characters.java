public class Add Minimum Characters {
    public static boolean isPal(StringBuilder str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            return false;
        }
        return true;
    }
	public static int addMinChar(String str){
		//code here
		//int count = 0;
		
		StringBuilder sb = new StringBuilder(str);
		if(isPal(sb))
		return 0;
		//int j = sb.length()-1;
		while(sb.length()>1){
		    if(isPal(sb)){
		        return str.length() - sb.length();
		    }
		    else{
		        sb.deleteCharAt(sb.length()-1);
		    }
		}
		return str.length() - sb.length();
		}
}
}
