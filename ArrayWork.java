
public class ArrayWork {  
    public static double ArrayFunc(double[] w, int func) {
    
 	if (func == 1) {
 		double Minwert = w[0];
 		for( int i = 1 ; i < w.length ; i++) {
 			if(Minwert > w[i]) {
 				Minwert = w[i];
 			}
 		}
 		return Minwert;
 		
 	}else if (func ==2) {
 		double Maxwert = w[0];
 		for( int i = 1 ; i < w.length ; i++) {
 			if(Maxwert < w[i]) {
 				Maxwert = w[i];
 			}
 		}
 		return Maxwert;
 		
 	}else if (func ==3) {
 		
 		double sum = 0;
 		for (double i:w) {
 			sum += i;
 		}
 		double result = sum/w.length;
 		
 		return result;
 		
    }else if (func ==4) {
    	double result = 0;
    	for (double i:w) {
    		result += i;	
 		}
    	result = result*1.19;
    	return result	;
    }else {
    	return 0;
    }
    }
    

    public static void main(String[] args) {    
      /*int arg=Integer.parseInt(args[0]);    
      ArrayWork aw = new ArrayWork();
      
      double werte[] = {1.9, 4.6, 99.0, 12.49, 78.99, 0.5, 56.98, 8.90, 119.90, 2.20};

      System.out.println(aw.ArrayFunc(werte, arg));*/
    	double werte[] = {1.9, 4.6, 99.0, 12.49, 78.99, 0.5, 56.98, 8.90, 119.90, 2.20};
    	
    	System.out.println(ArrayFunc(werte,1));
    	System.out.println(ArrayFunc(werte,2));
    	System.out.println(ArrayFunc(werte,3));
    	System.out.println(ArrayFunc(werte,4));
    	
    	
    }
}