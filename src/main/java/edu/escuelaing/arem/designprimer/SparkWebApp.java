package edu.escuelaing.arem.designprimer;

import static spark.Spark.get;
import static spark.Spark.port;

public class SparkWebApp {
	
	public static void main(String[] args) {
            port(getPort());
            get("/hello", (req, res) -> "Hello Heroku");
	}
        
        public static int getPort(){
            if(System.getenv("PORT") != null){
                return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567;
        }
}