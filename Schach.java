import java.lang.Math;

public class Schach
{
	
	public int felder(int cent) {
	   int wert = 0;
	   int i = 0;
	   int felder = 1;
		while (cent > wert) {
            i += 1;
			wert += i;
			i = 2*i;
			felder +=1;
		}
		return felder-1;
	}
    public static void main(String[] args)
    {
        Schach koenigSchach= new Schach();

        int centStuecke=1000; //Ausgabe muss bei 1000 Centstücken 9 sein.
    
        System.out.println(koenigSchach.felder(centStuecke));
      // System.out.println(felder(1000));
    }    
}