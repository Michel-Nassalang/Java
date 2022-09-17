package sipix;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {
	public static void main(String[] args) {
		Map<String, Integer> person = new HashMap<>();
		person.put("Mike", 23);
		person.put("Edgar", 23);
		person.put("Mandou", 17);
		System.out.println(person.toString());
		double moyenne = 0;
		for(Entry<String, Integer> bloc : person.entrySet()) {
			System.out.println(bloc.getKey() + " a une age de "+ bloc.getValue() + " ans.");
			moyenne += bloc.getValue();
		}
		moyenne = moyenne/person.size();
		System.out.println("La moyenne d\'age dans l\'ensemble est de : "+moyenne);
	}

}
