import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        validParanthesis("{{[}}(){}]");
    }

    private static void validParanthesis(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if ((ch == '{' || ch == '[' || ch == '(')) {
                stk.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stk.empty() || !matching(stk.peek(), ch)) {
                   System.out.println("Invalid Paranthesis");
                   return;
                }
                else {
                    stk.pop();
                }
            }

        }
        if(stk.empty()){
            System.out.println("Valid paranthesis");
        }
        else {
            System.out.println(("Invalid paranthesis"));
        }
    }
    private static boolean matching(char open , char close){
        return (open == '{' && close == '}') || (open == '[' && close == ']') || (open == '(' && close == ')');
    }

}
