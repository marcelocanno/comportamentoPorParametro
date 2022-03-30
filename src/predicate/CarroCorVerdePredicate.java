package predicate;

import Interfaces.CarroPredicate;
import comportamentoPorParametro.Carro;

public class CarroCorVerdePredicate implements CarroPredicate{
	
	@Override
	public boolean test(Carro carro) {
		return carro.getCor().equals("verde");
	}
}
