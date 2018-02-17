package homework;
public class stringcheck {
	static Boolean check(String str) {
		Boolean check = false, number = false, letter = false, Uppercase = false;
		String substr;
		String lowcase = str.toLowerCase();
		for(int i = 0; i<str.length(); i++) {
			substr = str.substring(i, i+1);
			if (substr.matches("[0-9]+"))
				number = true;
			else if (substr.matches("[a-zA-Z]+"))
				letter = true;
			substr = "";
		}
		if (!(str.equals(lowcase)))
			Uppercase = true;
		if(number && letter && Uppercase && str.length()>=8) 
			check = true;		
		return check;
	}
	public static void main(String[] args) {
		String text = "Blabla123";
		System.out.println(check(text));
	}
}