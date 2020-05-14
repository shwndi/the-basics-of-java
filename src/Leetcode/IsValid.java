package Leetcode;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        String str = "([()()]){}";
        boolean b = isValid(str);
        System.out.println(b);
    }

    private static boolean isValid(String s) {
        if (s.length()%2==1){
            return false;
        }
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;
    }
}
