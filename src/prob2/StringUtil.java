package prob2;

public class StringUtil {
    public static String concatenate(String[] str){
    	String s = null;
    	
    	for(int i=0; i<str.length; i++){
    		if(i == 0)
    			s = str[i];
    		else
    			s = s.concat(str[i]);
    	}
    	
    	return s;
    	
//    	선생님 방법
//    	StringBuffer sb = new StringBuffer(str[0]);
//    	for(int i=1; i<str.length; i++){
//    		sb.append(str[i]);
//    	}
//    	return sb.toString();
    }

    public static void main(String args[])  {         
        String[] strArr = { "SuperMan", "BatMan", "SpiderMan" };
        
        String resultStr = concatenate(strArr);
        System.out.println( "결과 문자열 : " + resultStr ); 
    }
}

