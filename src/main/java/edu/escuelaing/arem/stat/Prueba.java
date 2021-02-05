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
public class Prueba {
    
    public static void main (String[] args){
       LinkedList<Double> list = new LinkedList<>();
       list.add(160.0);
       list.add(591.0);
       list.add(229.0);
       list.add(230.0);
       list.add(270.0);
       list.add(128.0);
       list.add(1657.0);
       list.add(624.0);
       list.add(1503.0);
       
        Node<Double> n = list.getFirst();
        Double value = n.getValue();
        
        while(n.getNext() != null){
            System.out.println(value);
            n = n.getNext();
            value = n.getValue();
        }
       
       
    }
    
}
