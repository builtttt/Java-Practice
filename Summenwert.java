public class Summenwert {

	public static void main(String[] args) {
		System.out.println(bruchSumme(3));

	}


	public static double bruchSumme(int n) {
		double result = 0.0;
		for(double i=1; i<=n; i++) {
			result += (1/i);
		}
		return result;
	}
}
	
