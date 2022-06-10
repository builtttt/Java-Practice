import java.io.*;
import java.lang.Integer;

public class Rest {	
    public String checkModulo(int i, int j){
       int modulo = i%j;
       if (modulo == 0){
    	   return "Der Rest ist null";
       }else if (modulo == 2 || modulo == 3 || modulo == 5 || modulo == 7 ) {
    	   return "Der Rest ist eine einstellige Primzahl";
       }else if (modulo % 2 != 0) {
    	   return "Der Rest ist ungerade";
       }else {
    	  return "Keine der Aussagen trifft zu";
       }
     }
    
    
    
    public static void main(String[] args) {		
        int i = Integer.parseInt(args[0]);		
        int j = Integer.parseInt(args[1]);
        Rest r = new Rest();
        
        System.out.println(r.checkModulo(i,j));

    }
}

