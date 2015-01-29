/*
 * Class : QueueTest.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Jan 18, 2015, 3:16:11 PM
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
public class QueueTest {
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.enQueue(20);
        stack.enQueue(30);
        stack.enQueue(40);
        stack.enQueue(60);        
        stack.dQueue();
        stack.dQueue();
        stack.dQueue();
        stack.dQueue();
    }
}
