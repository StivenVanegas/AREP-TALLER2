/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.stat;

/**
 *
 * @author StivenVanegas
 */
public class Node<E> {
    
    private Node next;
    private E value;
    
    public Node(E value){
        this.value = value;
    }
    
    public void setNext( Node node){
     this.next = node;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public E getValue(){
        return this.value;
    }
    
    
}
