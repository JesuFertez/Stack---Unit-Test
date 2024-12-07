package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
      /*  stack.push(2);
        stack.push(5);
        stack.push(7);
        //System.out.println( stack.push(7));
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        //System.out.println(stack.size());*/
        stack.pop();
        System.out.println(stack.size());
    }
}