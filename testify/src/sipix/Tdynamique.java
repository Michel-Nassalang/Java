package sipix;

import java.util.ArrayList;

public class Tdynamique {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Terre");
		list.add("Planète");
		list.add("Jupyter");
		list.add("Mars");
		list.add("Neptune");
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains("Neptune"));
	}

}
