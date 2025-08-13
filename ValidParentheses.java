import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put(']', '[');
        matchingBrackets.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.empty() || stack.pop() != matchingBrackets.get(c)){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}