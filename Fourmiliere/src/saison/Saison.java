package saison;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

import nid.Fourmilliere;

public class Saison extends Observable {
	
	
	Etat monEtat;
	
	public Saison() {
		monEtat = Etat.Ete;
		
		while(true) {
			
			Thread thread = new Thread(){
			    public void run(){
								try {
									TimeUnit.SECONDS.sleep(10);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								changesaison();
			    }
			};    
			thread.start();
		}
	}
	
	public void changesaison() {
		
		if (monEtat==Etat.Printemps) {
			
			monEtat=Etat.Ete;
		}
		
		if (monEtat==Etat.Ete) {
			
			monEtat=Etat.Automne;
			
		}
		if (monEtat==Etat.Automne) {
			
			monEtat=Etat.Hiver;
			
		}
		if (monEtat==Etat.Hiver) {
			
			monEtat=Etat.Printemps;
			this.notifyObservers();;
		}
	}
	
	public void addecouteurFourmiliere(Fourmilliere nouvelleFourmiliere) {
		this.addObserver(nouvelleFourmiliere);
	}

}
