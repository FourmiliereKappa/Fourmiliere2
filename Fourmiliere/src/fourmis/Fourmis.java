package fourmis;

import nid.Fourmilliere;

public class Fourmis {

	double Poid;
	double viemax;

	Fourmilliere fourmillieredefourmis;
	
	
	public Fourmis(double  poidf,Fourmilliere Fourmillieredefourmis) {
		Poid = poidf;
		viemax = 2.5;
		fourmillieredefourmis=Fourmillieredefourmis;
		System.out.println("je suis creer");
	}

	
}
