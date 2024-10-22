import java.util.ArrayDeque;
import java.util.Deque;


public class Main {



    public static void main(String[] args) {
        String s = "((())()))(((())))";
        System.out.println(RemoveOuterBrackets(s));
    }


    static String RemoveOuterBrackets(String str){
        StringBuilder trueStr = new StringBuilder();

        Deque<Character> stack = new ArrayDeque<>();
        char [] charArray = str.toCharArray();
        char lastCh=' ';
        for(char c: charArray){
            if(c =='('){
                if(stack.isEmpty()){
                    trueStr.append(c);
                    stack.push(c);
                }
            }
            else {
                if(!stack.isEmpty()){
                    lastCh = stack.pop();
                }
                if (lastCh == '(' & stack.isEmpty()){
                    trueStr.append(c);
                    lastCh = ' ';
                }
            }
        }

        return trueStr.toString();
    }

    
}