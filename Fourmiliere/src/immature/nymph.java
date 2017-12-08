package immature;

import java.util.concurrent.TimeUnit;

import EnumTypeFourmis.TypeFourmis;
import nid.Fourmilliere;

public class nymph extends Immature {
	
	public nymph(TypeFourmis job,Fourmilliere maFourmilliere) {
		super(job, maFourmilliere);
		evolve();
	}

	public void evolve() {
		
		
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("nymph change");
		
		getmaFourmilliere().creerFourmis(Math.random() * 30 ,getmonjob());
		getmaFourmilliere().removeimmature(this);
	}
	
}
