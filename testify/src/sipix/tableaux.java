package sipix;

public class tableaux {
	public static void main(String[] args) {
		String[] ensemble = {"Michel", "Edgar", "Mandou", "MP", "Jacques"};
		System.out.println(ensemble[0] + " est l\'éditeur de ce texte.");
		System.out.println("Les noms qui composent l\'ensemble sont :");
		for (int i=0;i<=ensemble.length-1;i++) {
			System.out.println(ensemble[i]);
		}
		String ens = "Michel,Edgar,Mandou,MP,Jacques";
		String[] ense = ens.split(",");
		System.out.println(" Pour une deuxième fois, les noms qui composent l\'ensemble sont :");
		for (int i=0;i<=ense.length-1;i++) {
			System.out.println(ense[i]);
		}
		System.out.println("Créons des tableaux dans des tableaux");
		int[][] surensemble = {
			{3,5,10},
			{6,7,1},
			{2,8,9}
		};
		System.out.println(surensemble[1][2]);
	}
}
