
public class Maison {

	private float surface;
	private Porte window;
	
	public Maison() {
		super();
	}

	public Maison( float surface) {
		super();
		this.surface = surface;
	}

	public Maison( float surface, Porte porte) {
		super();
		this.surface = surface;
		this.window = porte;
	}
	
	public float getSurface() {
		return this.surface;
	}
	
	public void setSurface(float n) {
		this.surface = n;
	}
	
	public void Afficher() {
		System.out.println("La maison a une surface de " + getSurface()+ " m2");
	}

	public Porte getPorte() {
		return this.window;
	}
	
	public void setPorte(Porte p) {
		this.window = p;
	}

}
