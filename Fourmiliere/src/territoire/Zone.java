package territoire;

import java.util.ArrayList;
import java.util.Observable;

import ennemi.Adversaire;
import nid.Fourmilliere;
import saison.Saison;

public class Zone extends Observable {
	
	ArrayList<Adversaire> mesEnnemis;
	static ArrayList<Fourmilliere> mesFourmillieres;
	static Saison maSaison = new Saison();
	int LongueurM=15;
	int LargeurM=15;
	
	public void sedeplacer() {
		mesFourmillieres = new ArrayList<Fourmilliere>();
		mesEnnemis = new ArrayList<Adversaire>();
	}
	
	public void addEnnemis(Adversaire monEnnemi) {
		
	}
	
	public void addFourmiliere(Fourmilliere maFourmilliaire) {
		
	}
	
	public static Fourmilliere buildFourmiliere() {
		Fourmilliere maFourmiliere = new Fourmilliere();
		//mesFourmillieres.add(maFourmiliere);
		//maSaison.addecouteurFourmiliere(maFourmiliere);
		return maFourmiliere;
		
	}
}
