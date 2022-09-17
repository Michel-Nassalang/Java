package sipix;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code = 5;
		String mot = "Codex";
		boolean is = true;
		if(code >= 4 && !is) {
			System.out.println(mot +" est le bon code.");
			System.out.println("Le code est de " + code +" lettres");
		}else {
			System.out.println(mot +" n\'est pas le bon code.");
		}
		switch(code) {
		case 10 :
			System.out.println("Code égal à 10");
		break;
		case 15 : 
			System.out.println("Code égal à 15");
		break;
		case 5 : 
			System.out.println("Code égal à 5");
		break;
		}
	}

}
