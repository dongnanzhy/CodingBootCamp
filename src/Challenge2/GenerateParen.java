package Challenge2;

import java.util.ArrayList;

public class GenerateParen {
	public ArrayList<ArrayList<Character>> generate(int n) {
		ArrayList<ArrayList<Character>> rst = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> list = new ArrayList<Character>();
		helper(rst, list, n);
		return rst;
	}
	 
	/* Wrapper over _printParenthesis()*/
	
	private char[] str = new char[100];  
	public void printParenthesis(int n)
	{
	  if(n > 0)
	     printHelp(0, n, 0, 0);
	  return;
	}     
	 
	public void printHelp(int pos, int n, int open, int close)
	{    
	 
	  if(close == n) 
	  {
	    System.out.println(str);
	    return;
	  }
	  else
	  {
	    if(open > close) {
	        str[pos] = '}';
	        printHelp(pos+1, n, open, close+1);
	    }
	    if(open < n) {
	       str[pos] = '{';
	       printHelp(pos+1, n, open+1, close);
	    }
	  }
	}
	
	private void helper(ArrayList<ArrayList<Character>> rst, ArrayList<Character> list, int n) {
		if (n == 0) {
			rst.add(list);
			return;
		}
		ArrayList<Character> fullP = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			fullP.add('{');
		}
		for (int i = 0; i < n; i++) {
			fullP.add('}');
		}
		rst.add(fullP);
		list.add('{');
		list.add('}');
		helper(rst, list, n - 1);
	}
	
	public ArrayList<ArrayList<Character>> generate2(int n) {
		ArrayList<ArrayList<Character>> rst = new ArrayList<ArrayList<Character>>();
		//ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 1; i <= n; i++) {
			if (i > 1) {
				for (ArrayList<Character> list : rst) {
					list.add('{');
					list.add('}');
				}
			} 
			ArrayList<Character> fullP = new ArrayList<Character>();
			for (int k = 0; k < i; k++) {
				fullP.add('{');
			}
			for (int k = 0; k < i; k++) {
				fullP.add('}');
			}
			rst.add(fullP);
		}
		return rst;
	}
	
	public static void main(String[] args) {
		GenerateParen result = new GenerateParen();
		result. printParenthesis(3);
		//System.out.println(result.generate2(3));
	}
}
