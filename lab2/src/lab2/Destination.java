package lab2;

public class Destination {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	//metoda toString generata de IDE
	public String toString() {
		return "Destination [name=" + name + "]";
	}

}
