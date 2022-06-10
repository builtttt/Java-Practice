class Alter {
  
	public String gibBezeichnung(int Alter) {
		String result = "";
		//Hier steht Ihre loesung
		if (Alter < 18) {
			if (Alter <= 0){
				result = ("Mit Deinem Alter stimmt was nicht!");
			}else {
			result = ("Du bist ja noch ein Kind!");}
		}else if (Alter < 67) {
			result =  ("Du stehst mitten im Leben!");
		}else if (Alter >= 67) {
			result = ("Als Rentner hat man es gut!");}
		
		return result;
		}


	
	
	
	
	public static void main(String args[]) {
		Alter alterBezeichnung = new Alter();
		System.out.println(alterBezeichnung.gibBezeichnung(44));
	
	
  }
}
