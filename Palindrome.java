public class Palindrome{
    public static boolean is_palindrome(String S)
    {

boolean isPalin = true;	
    int start = 0; int end = S.length()-1;
  	int middle = (start + end )/2; int i ;
    	
    for (i=start;i<=middle;i++) {
    		
        if (S.charAt(start)== S.charAt(end)) {
    			start ++;
    			end--; 			
  	}else {
    		isPalin = false;
    			break;  			
    		}
    	}   	
    	return isPalin;	
    }
    }

