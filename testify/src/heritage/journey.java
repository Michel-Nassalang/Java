package heritage;

public enum journey {
	matin(8),
	midi(12),
	apresmidi(15),
	soir(22),
	nuit(0);
	private int heure;

	journey(int heure){
		this.heure = heure;
	}
	public int getheure() {
		return heure;
	}
}
