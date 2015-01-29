/*
 * Class : Stack.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Jan 18, 2015, 1:37:19 PM
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
public class Stack {
    int items[] = new int[20];
    int top1;
    int top2;
    Stack(){
        top1 = -1;
        top2 = 20;
    }
    /**
     * add the value in the stack 1
     * @param a 
     */
    public void push1(int a){
        if (!isStackFull()){
            top1 = top1 + 1;
            items[top1] = a;
            display();
        } else {
             System.out.println(" Stack is full ");
        }
    }
    /**
     * add the value in the stack 2
     * @param a 
     */    
    public void push2(int a){
        if (!isStackFull()){
            top2 = top2 - 1;
            items[top2] = a;
            display();
        } else {
             System.out.println(" Stack is full ");
        }
    }
    /**
     * extract the value from stack 1
     * @return 
     */
    public int pop1(){
        if (!isEmptyStack1()){
            int value = items[top1];
            top1 = top1 - 1;
            return value;
        } else {
             System.out.println("Stack1 is empty ");
             return -1;
        }
    }
    /**
     * extract the value from stack 2 
     * @return 
     */
    public int pop2(){
        if (!isEmptyStack2()){
            int value = items[top2];
            top2 = top2 + 1;
            return value;
        } else {
             System.out.println("Stack2 is empty");
             return -1;
        }
    }
    /**
     * check if stack 1 is empty
     * @return 
     */
    public boolean isEmptyStack1(){
        if(top1 == -1)
            return true;
        else{
            return false;
        }        
    }
    /**
     * check if stack 2 is empty
     * @return 
     */
    public boolean isEmptyStack2(){
        if(top2 == 20)
            return true;
        else{
            return false;
        } 
    }
    /**
     * check if stack is full
     * @return 
     */
    public boolean isStackFull()
    {
        if (top1 == (top2 - 1)){
            return true;
        } 
        return false;
    }
    /**
     * display the value from the stack 
     */        
    public void display(){
        System.out.println(" Stack 1 : ");
        for(int i = 0; i <= top1; i++ ){
            System.out.print(" " + items[i]);
        }
        System.out.println();
        System.out.println(" Stack 2 : ");
        for(int j = 19; j >= top2; j-- ){
            System.out.print(" " + items[j]);
        }
        System.out.println();
    }
    /**
     * enqueue the value
     * @param a 
     */
    public void enQueue(int a){
        push1(a);
    }
    /**
     * dequeue the value from queue
     */
    public void dQueue(){
        if (isEmptyStack2()) {
            int size = top1;
            for (int i = 0 ; i <= size; i++ ){
                    push2(pop1());
            }            
        }
        System.out.println(pop2());
    }
    
}
