package sipix;

public class boucles {

	public static void main(String[] args) {
		fonctions.salut();
		//boucle for
		for (int i=0;i<=10;i++) {
			System.out.println(i);
		}
		// boucle tant que
		int j=0;
		while (j<5) {
			System.out.println(j);
			j++;
		}
		//boucle faire tant que
		int l = 0;
		do {
			l++;
			System.out.println("Salut, l\'ami!!");
		}while(l<=10);
	}
}
