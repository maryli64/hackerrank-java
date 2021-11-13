package main;

import java.util.Stack;

public class ParenthesisMatching {

    public boolean isValid(String s) {
        String leftRoundParenthesis = "(";
        String leftSquareParenthesis = "[";
        String leftCurlyParenthesis = "{";

        String rightRoundParenthesis = ")";
        String rightSquareParenthesis = "]";
        String rightCurlyParenthesis = "}";

        Stack<String> stack = new Stack<>();

        for (char charParenthesis : s.toCharArray()) {
            String parenthesis = String.valueOf(charParenthesis);

            if (parenthesis.equals(leftRoundParenthesis) || parenthesis.equals(leftSquareParenthesis) || parenthesis.equals(leftCurlyParenthesis)) {
                stack.push(parenthesis);
            } else {
                //closing bracket here
                if (stack.isEmpty()) {
                    return false;
                }

                String stackParenthesis = stack.pop();

                if (parenthesis.equals(rightRoundParenthesis) && !stackParenthesis.equals(leftRoundParenthesis)) {
                    return false;
                } else if (parenthesis.equals(rightSquareParenthesis) && !stackParenthesis.equals(leftSquareParenthesis)) {
                    return false;
                } else if (parenthesis.equals(rightCurlyParenthesis) && !stackParenthesis.equals(leftCurlyParenthesis)) {
                    return false;
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
