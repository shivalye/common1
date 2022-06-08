package personFiltering.implementation;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import personFiltering.dto.Person;

public class NamePersonPredicate implements Predicate<Person>{
	
	private Pattern pattern;

	public NamePersonPredicate(String regEx) {
		super();
		this.pattern = Pattern.compile(regEx);
	}

	@Override
	public boolean test(Person person) {
		Matcher matcher = pattern.matcher(person.getName());
		return matcher.find();
	}
	
	
	

}
