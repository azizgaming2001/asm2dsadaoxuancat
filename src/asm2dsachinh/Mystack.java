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
public class Mystack {
    Node head;
    int size;
    public Mystack(){
        this.size = 0;
        this.head = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }

    public Node pop(){
        try {
            Node node = head;
            head = head.next;
            size--;
            return node;
        }
        catch(Exception e) {
            return null;
        }
    }
    public void push(Node node){
        node.next = head;
        head = node;
        size++;
    }
}

//    public void print(){
//        if(!isEmpty()) {
//            Node currentNode = head;
//            while(currentNode != null){
//                System.out.println(currentNode.data);
//                currentNode = currentNode.next;
//            }
//            System.out.println("");
//        }
//    }
