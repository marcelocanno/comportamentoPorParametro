package predicate;

import java.util.Calendar;

import Interfaces.CarroPredicate;
import comportamentoPorParametro.Carro;

public class carrosDezAnosRecentesPredicate implements CarroPredicate {

	@Override
	public boolean test(Carro carro) {
		return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
		
	}
	
	

}
