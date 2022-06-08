package personFiltering.dto;

public class Person {
	private String name;
	private int age;
	private double veight;
	private boolean married;
	
	public Person(String name, int age, double veight, boolean married) {
		super();
		this.name = name;
		this.age = age;
		this.veight = veight;
		this.married = married;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", veight=" + veight + ", married=" + married + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getVeight() {
		return veight;
	}

	public boolean isMarried() {
		return married;
	}
	
	

}
