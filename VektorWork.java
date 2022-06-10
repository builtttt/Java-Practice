import java.util.Arrays;

public class VektorWork {
	
	public static int[] addVektor(int[]a,int[]b) {
		int length;
		
		if (a.length > b.length) {
			length = a.length;
		}else {
			length = b.length;
		}
		//making new Arrays that are big enought
		int A[] = new int[length];
		int B[] = new int[length];
		int c[] = new int[length];
		for(int i = 0;i<a.length;i++) {
			A[i] = a[i];
		}
		for(int i = 0;i<b.length;i++) {
			B[i] = b[i];
		}
		//adding Vectors
		for(int i = 0; i < length; i++) {
			c[i] = A[i]+B[i];
		}
		return c;
		
	}
	
	public static void main(String[] args) {
		int [] vektora = {1,2,3,4,5};
		int [] vektorb = {1,2,3,4};
		int [] resultlist = addVektor(vektora,vektorb);
		System.out.println(Arrays.toString(resultlist));
	}

}

