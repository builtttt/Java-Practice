public class Discount
{
	
	public static String berechneRabatt(double betrag) {
		
		if (betrag > 1000) {
			double gerechnetbetrag = betrag - betrag * 0.08;
			
			return "Betrag mit Rabattt: " + String.format("%.2f", gerechnetbetrag);
			//return "Betrag mit Rabattt: " + gerechnetbetrag;
		}else {
			//return "Zu zahlender Betrag: "+ String.format("%.2f", betrag);
			return "Zu zahlender Betrag: " + betrag;
		}
	}
	
    public static void main(String[] args)
    {/*
        double rechnungsBetrag = 0.0; //Rechnungsbetrag

        rechnungsBetrag = Double.parseDouble(args[0]); //Kommandozeilenargument als Gleit-
                                                       //kommazahl auswerten (Umwandlung in
                            						   //eine double-Zahl)
    
        System.out.println(berechneRabatt(rechnungsBetrag));*/
    	System.out.println(berechneRabatt(999));
    	System.out.println(berechneRabatt(1234.45));
    	System.out.println(berechneRabatt(1000));;
    }    
}
