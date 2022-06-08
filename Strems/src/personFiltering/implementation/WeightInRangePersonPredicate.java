package personFiltering.implementation;

import java.util.function.Predicate;

import personFiltering.dto.Person;

public class WeightInRangePersonPredicate implements Predicate<Person>{
	
	private double lowerBound;
	private double upperBound;
	
	
	
	public WeightInRangePersonPredicate(double lowerBound, double upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}



	@Override
	public boolean test(Person person) {
		return person.getVeight() >= lowerBound && person.getVeight()<upperBound;
	}
}
