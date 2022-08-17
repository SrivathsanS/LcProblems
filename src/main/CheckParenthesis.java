package main;

import java.util.Stack;

public class CheckParenthesis {

    public static void main(String []args){

        String input = "(a+b)[";
        Stack<Character> parenthesisStack = new Stack<Character>();
        boolean validParenthesis = true;
        char []charArray = input.toCharArray();
        for(int i=0;i<charArray.length;i++) {
            if (charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[') {
                parenthesisStack.push(charArray[i]);
            } else if (charArray[i] == '}' || charArray[i] == ')' || charArray[i] == ']') {
                if(!parenthesisStack.isEmpty()) {
                    char parenthesis = parenthesisStack.pop();
                    if (charArray[i] == '}' && parenthesis != '{') {
                        System.out.println("invalid");
                        validParenthesis = false;
                        break;
                    }
                    if (charArray[i] == ')' && parenthesis != '(') {
                        System.out.println("invalid");
                        validParenthesis = false;
                        break;
                    }
                    if (charArray[i] == ']' && parenthesis != '[') {
                        System.out.println("invalid");
                        validParenthesis = false;
                        break;
                    }
                }
                else{
                    System.out.println("invalid");
                    validParenthesis = false;
                    break;
                }
            }


        }
        if(!parenthesisStack.isEmpty()){
            System.out.println("invalid");
            validParenthesis=false;
        }
        if(validParenthesis)
            System.out.println("valid");
    }
}
