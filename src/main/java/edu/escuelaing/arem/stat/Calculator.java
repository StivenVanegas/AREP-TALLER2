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
public class Calculator {
    
    /**
     * 
     * @param list list of values
     * @return the mean from de list
     */
    public static double mean(LinkedList<Double> list){
        
        Node<Double> n = list.getFirst();
        Double value = n.getValue();
        Double mean = 0.0;
        mean += value;
        
        while(n.getNext() != null){
            n = n.getNext();
            value = n.getValue();
            mean += value;
        }
        double r = mean / list.size();
        double a = (double) Math.round(r*100)/100;
        return a;
        
    }
    
    /**
     * 
     * @param list list of values
     * @return the standard variation from de list
     */
    public static double stdDev(LinkedList<Double> list){
        
        double mean = mean(list);
        
        Double sumatoria = 0.0;
        Node<Double> n = list.getFirst();
        Double value = n.getValue();
        Double sum = Math.pow(value - mean,2);
        sumatoria += sum;
        while(n.getNext() != null){   
            n = n.getNext();
            value = n.getValue();
            sum = Math.pow(value - mean,2);
            sumatoria += sum;
        }
        
        double std = Math.sqrt(sumatoria/(list.size()-1));
        
        return (double) Math.round(std*100)/100 ;
    }
    
}
