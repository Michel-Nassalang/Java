package sipix;

public class Exceptions {

	public static void main(String[] args) {
		int[] number = {2,5,7,1};
		try {
			System.out.println(number[4]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("L\'erreur se trouve au niveau de cette ligne");
		}
		int calcul = 5+6;
		try {
			System.out.println(number[3]);
			calcul /= 0;
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println("L\'erreur se trouve au niveau de cette ligne");
		}finally {
			System.out.println("Finalement, il faudra tenter une autre facon.");
		}
		try {
			achat(6500, 6000);
		} catch (MoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void achat(int calpe , int prix) throws MoneyException {
		int res = calpe - prix;
		if(res>0) {
			System.out.println("Le restant est de : " + res);
		}else {
			throw new MoneyException();
		}
		
	}

}
