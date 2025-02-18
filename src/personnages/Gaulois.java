package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String paroles) {
		System.out.println("Le gaulois " + nom + " : " + paroles);
	}

	public void frapper(Romain victime) {
		System.out.println("Le gaulois " + nom + " : Envois un grand coup dans la machoire de " + victime.getNom());
		victime.recevoirCoup(force / 3);
	}
	


//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Ast�rix", 8);
//		System.out.println(asterix.getNom() + "B");
//	}
}
