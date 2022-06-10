import java.io.*;

public class Java_GGT {

	  public int ggT (int a, int b) {    
		  int m = a, n=b, r=1;
		  while(r != 0) {
			  if(m<n) {
				  int wait = n;
				  n = m;
				  m = wait;
			  }
			  r = m-n;
			  m = n;
			  n = r;
		  }
		  return m;
	  }
	
 
	  public static void main(String[] args) {    
	       Java_GGT c = new Java_GGT();    
	       System.out.println(c.ggT(48,32));  
	  }
}