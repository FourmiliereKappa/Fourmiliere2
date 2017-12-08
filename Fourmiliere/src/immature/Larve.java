package immature;

import java.util.concurrent.TimeUnit;

import EnumTypeFourmis.TypeFourmis;
import nid.Fourmilliere;

public class Larve extends Immature {

	public Larve(TypeFourmis job,Fourmilliere maFourmilliere) {
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
		System.out.println("larve change");
		
		nymph manymph =new nymph(getmonjob(),getmaFourmilliere());
		getmaFourmilliere().nouvelleimmature(manymph);;
		getmaFourmilliere().removeimmature(this);
	}
	
}
