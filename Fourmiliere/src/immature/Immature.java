package immature;

import java.util.Observable;

import EnumTypeFourmis.TypeFourmis;
import nid.Fourmilliere;

public class Immature extends Observable{

	TypeFourmis job;
	Fourmilliere maFourmilliere;
	
	public Immature(TypeFourmis job,Fourmilliere maFourmilliere) {
		this.job=job;
		this.maFourmilliere=maFourmilliere;
	}
	
	public void evolve() {}
	
	public TypeFourmis getmonjob() {
		return job;
	}
	
	public Fourmilliere getmaFourmilliere() {
		return maFourmilliere;
	}
	
}
