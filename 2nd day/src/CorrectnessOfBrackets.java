import java.util.*;

public class CorrectnessOfBrackets {
	 static boolean IsBracketsCorrect(String expr)
	    {
	        
	        Deque<Character> stack = new ArrayDeque<Character>();
	 
	      
	        for (int i = 0; i < expr.length(); i++)
	        {
	            char x = expr.charAt(i);
	 
	            if (x == '(' || x == '[' || x == '{')
	            {
	               
	                stack.push(x);
	                continue;
	            }
	 
	           if (stack.isEmpty())
	                return false;
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }
	 
	     
	        return (stack.isEmpty());
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        String expr = "[{()}]";
	 
	        // Function call
	        if (IsBracketsCorrect(expr))
	            System.out.println("Corrected ");
	        else
	            System.out.println("Not Corrected ");
	    }
}
