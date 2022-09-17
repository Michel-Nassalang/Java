package heritage;

public class Orange extends Fruit implements Interface{

	public Orange(String nom, String pays, int code) {
		super(nom, pays, code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gout() {
		super.dicton();
		System.out.println("Le gout de l\'orange est sucré");
	}

	@Override
	public void sens() {
		System.out.println("L\'orange a une forme ronde");
	}

	@Override
	public void cover() {
		System.out.println("Avec une couverture moins dure");
	}

	@Override
	public boolean tendance() {
		return true;
	}	
}
