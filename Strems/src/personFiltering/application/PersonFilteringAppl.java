package personFiltering.application;

import java.util.Arrays;
import java.util.function.Predicate;

import personFiltering.dto.Person;
import personFiltering.implementation.MarriedPersonPredicate;
import personFiltering.implementation.NamePersonPredicate;
import personFiltering.implementation.OldPersonPredicate;
import personFiltering.implementation.WeightInRangePersonPredicate;

public class PersonFilteringAppl {
	
	public static void main(String[] args) {
		
			Person [] people = {new Person("Sasha", 64, 76.2, true),
								new Person("Masha", 25, 51.3, true),
								new Person("Dasha", 18, 48.3, false),
								new Person("Vasia", 45, 69.3, false),
								new Person("Anna", 35, 41.3, true)
								};
		System.out.println(Arrays.toString(filter(people, new MarriedPersonPredicate())));
		System.out.println(Arrays.toString(filter(people, new OldPersonPredicate(27))));
		System.out.println(Arrays.toString(filter(people, new WeightInRangePersonPredicate(45.,70.))));
		System.out.println(Arrays.toString(filter(people, new NamePersonPredicate("asha"))));
	}


	public static Person[] filter(Person[] people, Predicate<Person> predicate) {
		int counter = 0;
		for (int i=0; i<people.length;i++) {
			if(predicate.test(people[i])) counter++;
		}
		Person[] result = new Person[counter];
		counter = 0;
		
		for (int i=0; i<people.length;i++) {
			if(predicate.test(people[i])) result[counter++] = people[i];
		}
		return result;
	}

}
