package personnages;

public class Humain {

	public String nom;
	public int argent;
	public String boisson;
		
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
		
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appele" + nom +", j'aime boire du " + boisson + "et j'ai "+ argent + "euros en poche.");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
}
