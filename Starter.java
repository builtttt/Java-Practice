import java.io.*;

public class Starter {
	public int max(int a, int b) {
	    
	   if (a>b) {
		   return a;
	   }else if(b>a){
		   return b;
	   }else {
		   return a;
	   }

	}
	
	public static void main(String[] args) {
		Starter s = new Starter();
		System.out.println("Ausgabe: "+s.max(12,13)); //Beispielausgabe
	}
}