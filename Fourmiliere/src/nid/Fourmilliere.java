package nid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import EnumTypeFourmis.TypeFourmis;
import fourmis.Femelle;
import fourmis.Fourmis;
import fourmis.Male;
import fourmis.Ouvriere;
import fourmis.Reine;
import fourmis.Soldat;
import immature.Immature;

public class Fourmilliere implements Observer{

	HashMap<TypeFourmis,Fourmis> listfourmis;
	ArrayList<Immature>  listimmature;
	int x=0,y=0;
	
	
	
	int idFourmis = 0;
	
	public Fourmilliere() {
		listfourmis=new HashMap<TypeFourmis,Fourmis>();
		listimmature = new ArrayList<Immature>();
	}
	
	
	public void removeFourmis(Fourmis maFourmis) {
		
		TypeFourmis key;
		
		if (maFourmis instanceof Ouvriere) {
			key=TypeFourmis.Ouvriere;
			getFourmis().remove(key, maFourmis);
		}
		
		if (maFourmis instanceof Femelle) {
			key=TypeFourmis.Femelle;
			getFourmis().remove(key, maFourmis);
		}
		
		if (maFourmis instanceof Male) {
			key=TypeFourmis.Male;
			getFourmis().remove(key, maFourmis);
		}
		
		if (maFourmis instanceof Soldat) {
			key=TypeFourmis.Soldat;
			getFourmis().remove(key, maFourmis);
		}
		
	}
	
	public void creerFourmis(Double poid, TypeFourmis job) {
		
		TypeFourmis key;
		
		Fourmis nouvelleFourmis;
		
		if (job==TypeFourmis.Ouvriere) {
			key=TypeFourmis.Ouvriere;
			nouvelleFourmis=new Ouvriere(poid, this);
			getFourmis().put(key, nouvelleFourmis);
			return;
		}
		
		if (job==TypeFourmis.Femelle) {
			key=TypeFourmis.Femelle;
			nouvelleFourmis=new Femelle(poid, this);
			getFourmis().put(key, nouvelleFourmis);
			return;
		}
		
		if (job==TypeFourmis.Male) {
			key=TypeFourmis.Male;
			nouvelleFourmis=new Male(poid, this);
			getFourmis().put(key, nouvelleFourmis);
			return;
		}
		
		
		if (job==TypeFourmis.Soldat) {
			key=TypeFourmis.Soldat;
			nouvelleFourmis=new Soldat(poid, this);
			getFourmis().put(key, nouvelleFourmis);
			return;
		}
		
	}
	
	private HashMap<TypeFourmis,Fourmis> getFourmis(){
		return listfourmis;
	}
	
	private ArrayList<Immature> getImmature(){
		return listimmature;
	}
	
	public void nouvelleimmature(Immature monImmature) {
		getImmature().add(monImmature);
	}
	
	public void removeimmature(Immature monImmature) {
		getImmature().remove(monImmature);
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("changement saison");
		
	}


	public void creerreine(Reine reine) {
			getFourmis().put(TypeFourmis.Reine, reine);
	}
}
