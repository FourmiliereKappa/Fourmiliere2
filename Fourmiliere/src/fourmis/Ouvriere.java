package fourmis;

import java.util.Observable;
import java.util.Observer;

import nid.Fourmilliere;

public class Ouvriere extends Fourmis implements Observer{
	
	int x,y;

	public Ouvriere(double poidf,Fourmilliere fourmillieredefourmis) {
		super(poidf, fourmillieredefourmis);
		// TODO Auto-generated constructor stub
	}
	

	public int setx() {
		return x;
		
	}


	public int sety() {
		return y;
		
	}


	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
