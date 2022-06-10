import java.util.Arrays;

public class AccendingArray {
	public static void main(String[] args) {   
	
		double[] w = {1.9, 4.6, 99.0, 12.49, 78.99, 0.5, 56.98, 8.90, 119.90, 2.20};
		System.out.println(Arrays.toString(Accend(w)));
	}
	
	
	public static double[] Accend(double[] w) {
		double wait = 0;
		for (int i = 0; i < w.length; i++) {
			for (int j = i+1; j < w.length; j++) {
				if (w[j] < w[i]) {
					wait = w[i];
					w[i] = w[j];
					w[j] = wait;
				}
			}
		}
	return w;
	} 
}
