package personFiltering.implementation;

import java.util.function.Predicate;

import personFiltering.dto.Person;

public class MarriedPersonPredicate implements Predicate<Person>{

	@Override
	public boolean test(Person person) {

		return person.isMarried();
	}

}
