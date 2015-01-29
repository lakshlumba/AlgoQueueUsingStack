/*
 * Class : Test.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Jan 18, 2015, 1:37:30 PM
 * ---------------------------------------------------------------------------
 * Change History
 * Develper :
 * Reviwer :
 * Changed ON :
 * ---------------------------------------------------------------------------
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algos.stack;

/**
 *
 * @author Laksh
 */
public class Test {
    
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push1(20);
        stack.push1(30);
        stack.push1(40);
        stack.push2(100);
        stack.push2(20);
        stack.push2(30);
        stack.push2(40);
        stack.push2(20);
        stack.push2(30);//stack is full overe here, no more elements
        stack.push2(40);//stack is full overe here, no more elements         
        stack.display();
        stack.pop1();
        stack.pop2();
        stack.display();
    }
    
}
