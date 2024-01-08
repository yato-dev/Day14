package DS.BalancedParenthesis;
class BalancedParentheses {
   
    public static boolean isBalanced(String expression) {
        Stack stack = new Stack(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String inputExpression = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
        boolean isExpressionBalanced = isBalanced(inputExpression);

        if (isExpressionBalanced) {
            System.out.println("Arithmetic Expression is balanced.");
        } else {
            System.out.println("Arithmetic Expression is not balanced.");
        }
    }
}
