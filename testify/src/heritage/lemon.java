package heritage;

public class lemon extends Fruit implements Interface{

	public lemon(String nom, String pays, int code) {
		super(nom, pays, code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gout() {
		System.out.println("Le gout du lemon est amer");
	}

	@Override
	public void sens() {
		System.out.println("Le lemon a une forme ronde");
	}

	@Override
	public void cover() {
		System.out.println("Avec une couverture dure");
	}

	@Override
	public boolean tendance() {
		return false;
	}
	
}
