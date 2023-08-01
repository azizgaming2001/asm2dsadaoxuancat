/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm2dsachinh;


/**
 *
 * @author Admin
 */

public class Myqueue {
    Node head;
    Node tail;
    int size;
    public Myqueue() {
        head = tail = null;
        this.size = 0;
    }  
    public boolean isEmpty(){
        return (size == 0);
    }   
    public void enQueue(Node node){  
        if(isEmpty()){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public Node deQueue() {
        try {
            Node n = head;
            head = head.next;
            size--;
            return n;
        }  
        catch(Exception e) {
            return null;
        }
    }   
}


//    public void print(){
//        if(!isEmpty()){
//            Node currentNode = head;
//            while(currentNode != null){
//                System.out.println(currentNode.data);
//                currentNode = currentNode.next;
//            }
//            System.out.println("");
//        }
//    }
