
public class person implements Comparable<person> {

	private String month;
	private String name;

	person(String month, String name) {

		this.month = month;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public String getMonth() {

		return month;
	}

	@Override
	public String toString() {
		return (this.getName() + "\n" + this.getMonth());
	}

	public int compareTo(person person) {

		return (this.getName().compareTo(person.getName()));
	}

}
