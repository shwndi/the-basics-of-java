package infixVariableSuffix;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String input = "1+2*4/5-7+3/6";
        String output;
        InToPost theTrans = new InToPost(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
    }
}
