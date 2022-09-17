
public class InstancesEmployeResponsable {

	public static void main(String[] args) {
		Employe employe1 = new Employe("Edgar Mansal", "A", (float) 2.5);
		Employe employe2 = new Employe("Michel Nassalang", "B", 3);
		Employe employe3 = new Employe("Albert Sambou", "E", (float) 1.5);
		Employe employe4 = new Employe("Hervé Sanka", "F", (float) 2.3);
		Employe employe7 = new Employe("Aliou Kébé", "K", (float) 1.9);
		Employe employe8 = new Employe("Joanna Mendez", "M", (float) 3.4);
		Employe[] sous1 = {employe1, employe2};
		Responsable employe5 = new Responsable("Daniel Nassalang", "C", (float)6.5, sous1);
		Employe[] sous3 = {employe7, employe8};
		Responsable employe9 = new Responsable("Anta Gueye", "H", (float) 4.3, sous3);
		Employe[] sous2 = {employe3,employe4,employe5,employe9};
		Responsable employe6 = new Responsable("Jeanne Mansal", "D", (float) 5.6,sous2 );
		employe5.directafficher();
		employe6.indirectafficher();
	}

}
