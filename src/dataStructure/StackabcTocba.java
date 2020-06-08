package dataStructure;


import infixVariableSuffix.Stack;

/**
 * 字符串反转
 */
public class StackabcTocba {
    private String in;

    public StackabcTocba(String in) {
        this.in = in;
    }
    public String doRev(){
        int length = in.length();
        Stack stack = new Stack(length);
        for (int i = 0; i < length; i++) {
            char j = in.charAt(i);
            stack.push(j);
        }
        String out ="";
        while(!stack.isEmpty()){
            char pop = stack.pop();
            out+= pop;
        }
        return out;
    }

}
