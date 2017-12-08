package fourmis;

import java.util.concurrent.TimeUnit;

import EnumTypeFourmis.TypeFourmis;
import immature.Oeuf;
import nid.Fourmilliere;

public class Reine extends Femelle{
	
	Fourmilliere creationFourmilliere;
	boolean reinenotdead=true;
	Oeuf nouvelleoeuf;

	public Reine(double poidf,Fourmilliere fourmillieredefourmis) {
		super(poidf, fourmillieredefourmis);

		creationFourmilliere= new Fourmilliere();
		creationFourmilliere.creerFourmis(30.0, TypeFourmis.Reine);
		
		pondreoeuf();
		
	}
	
	public void pondreoeuf() {

		while(reinenotdead) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread thread = new Thread(){
			    public void run(){
			    	nouvelleoeuf = new Oeuf(TypeFourmis.Ouvriere,getcreationfourmilliere());
			    }
			};
			thread.start();
			
			getcreationfourmilliere().nouvelleimmature(nouvelleoeuf);
		
		}
		
	}
	
	private Fourmilliere getcreationfourmilliere() {
		return creationFourmilliere;
	}
	
}

