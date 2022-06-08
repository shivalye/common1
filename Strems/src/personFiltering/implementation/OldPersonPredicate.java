package personFiltering.implementation;

import java.util.function.Predicate;

import personFiltering.dto.Person;

public class OldPersonPredicate implements Predicate<Person>{
	
	private int bound;
	
	

	public OldPersonPredicate(int bound) {
		super();
		this.bound = bound;
	}



	@Override
	public boolean test(Person person) {
		// TODO Auto-generated method stub
		return person.getAge()>bound;
	}
	
	

}
