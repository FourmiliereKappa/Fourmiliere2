package immature;

import java.util.concurrent.TimeUnit;

import EnumTypeFourmis.TypeFourmis;
import nid.Fourmilliere;

public class Oeuf extends Immature {

	
	public Oeuf(TypeFourmis job,Fourmilliere maFourmilliere) {
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
		
		System.out.println("Oeuf change");
		
		Larve malarve =new Larve(getmonjob(),getmaFourmilliere());
		getmaFourmilliere().nouvelleimmature(malarve);;
		getmaFourmilliere().removeimmature(this);
	}
	
}
