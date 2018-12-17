package com.kkaty;

public class BalancedParenthesisBracelet {

    public static String  checkBalance(String str) {

        JStack stack = new JStack();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '[' || ch == '(' || ch == '{') {

                stack.push(ch);

            } else if ((ch == ']' || ch == '}' || ch == ')')

                    && (!stack.isEmpty())) {

                if (((char) stack.peek() == '(' && ch == ')')

                        || ((char) stack.peek() == '{' && ch == '}')

                        || ((char) stack.peek() == '[' && ch == ']')) {

                    stack.pop();

                } else {

                    return "Not Balanced";

                }

            } else {

                if ((ch == ']' || ch == '}' || ch == ')')) {

                    return "Not Balanced";

                }

            }

        }

        if (stack.isEmpty())

            return "Balanced Parenthisis";

        else

            return "Not Balanced";

    }

    public static void main(String[] args) {

        String str = "([{}])";

        if (str.isEmpty()) {

            System.out.println("Empty String");

            return;

        }

        System.out.println(BalancedParenthesisBracelet.checkBalance(str));

    }

}

