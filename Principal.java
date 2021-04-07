public class Principal
{
	public static void main(String[]args)
  {

if ( args.length == 1 )
    {
      String S = args[0] ; 
    
      boolean isPalindrome = Palindrome.is_palindrome(S) ;
    
      System.out.println("----------------------------------------------------");
      System.out.println("Input : " + S + " >>> Output : " + isPalindrome );    
      System.out.println("----------------------------------------------------");   
    }
		
  }
}

