package edu.escuelaing.arem.designprimer;

import edu.escuelaing.arem.stat.Calculator;
import edu.escuelaing.arem.stat.LinkedList;
import spark.Response;
import spark.Request;
import static spark.Spark.get;
import static spark.Spark.port;

public class SparkWebApp {
	
	public static void main(String[] args) {
            port(getPort());
            get("/index", (req, res) -> indexPage(req, res));
            get("/resultado", (req, res) -> calcular(req, res));
	}
        
        private static String indexPage(Request req, Response res){
            String index
                    ="<!DOCTYPE html>"
                    +"<html>"
                    +"<head>"
                    +"<meta charset='utf-8' />"
                    +"<title>SparkWeb App</title>"
                    +"<style> body {background-color: gray; margin: 0px;} header {background-color:black; width: 100%; padding-top: 20px;padding-bottom: 20px;} h1 {text-align: center; color: white; margin: 0px;} section{background-color:white; width:80%; margin: 0 auto;margin-top:10px; padding:10px; text-align:center;} h2{margin:0px;}</style>"
                    +"</head>"
                    +"<header>"
                    +"<h1>SparkWeb App</h1>"
                    +"</header>"
                    +"<section>"
                    +"<h2>Calculadora</h2>"
                    +"<p>Este programa calcula la media y desviacion estandar de un conjunto de datos.</p>"
                    +"<p>Ingrense los datos separados por coma ',' Ejemplo 12,6,4,7</p>"
                    +"<form action='/resultado'>"
                    +"<input type='text' name='data'>"
                    +"<input type='submit' value='calcular'>"
                    +"</form>"
                    +"</section>"
                    +"</html>";
            return index;
        }
        
        private static String calcular(Request req, Response res) {
            LinkedList list = new LinkedList();
            String [] data = req.queryParams("data").split(",");
            for (String i: data){
                list.add(Double.parseDouble(i));
            }
            
            double mean = Calculator.mean(list);
            double std = Calculator.stdDev(list);
            return "La media es: " + mean + "\n La desviacion estandar es: "+std;
        }
        
        public static int getPort(){
            if(System.getenv("PORT") != null){
                return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567;
        }
}