package Code;

public class makeFiscalCode {
	static final String[] months = {"","A","B","C","D","E","H","L","M","P","R","S","T"};

	public static String fiscalCode(String name, String surName, String gender, String dob) {
		String p1 = "", p2 = "", p3 = "";
		String v = "", c = "";
		//surname
		for(char ch : surName.toLowerCase().toCharArray()) {
			if("aeiou".contains(ch+"")) v += ch;
			else c += ch;
		}
		if(c.length() >= 3) p1 = c.substring(0,3);
		else {
			p1 = c; p1 += v.substring(0, Math.min(3-p1.length(), v.length())); p1 += (p1.length() < 3 ? "x" : "");
		}
		System.out.println(p1);
		//first name
		v = ""; c = "";
		for(char ch : name.toLowerCase().toCharArray()) {
			if("aeiou".contains(ch+"")) v += ch;
			else c += ch;
		}
		System.out.println(c);
		if(c.length() >= 4) p2 = c.charAt(0) + c.substring(2,4);
		else if(c.length() == 3) p2 = c;
		else {
			p2 = c; p2 += v.substring(0, Math.min(3-p2.length(), v.length())); p2 += (p2.length() < 3 ? "x" : "");
		}
		System.out.println(p2);
		//bd
		String[] BD = dob.split("/");
		p3 += BD[2].substring(2,4);
		p3 += makeFiscalCode.months[Integer.parseInt(BD[1])];
		if(gender.equals("M")) {
			p3 += String.format("%02d", Integer.parseInt(BD[0]));
		}else {
			p3 += Integer.parseInt(BD[0]) + 40;
		}
		
		
		return (p1 + p2 + p3).toUpperCase();
		
	}
}
