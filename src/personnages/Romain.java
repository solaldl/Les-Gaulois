package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String paroles) {
		System.out.println("Le romain " + nom + " : " + paroles);
	}

	public void recevoirCoup(int force) {
		this.force -= force;
		if (this.force < 0) {
			this.force = 0;
			this.parler("J'abandonne, j'espere que la sauce sera bonne.");
		} else {
			this.parler("Aïe ! Il faut me resaisir sinon César me transformera en salade.");
		}
	}
}
