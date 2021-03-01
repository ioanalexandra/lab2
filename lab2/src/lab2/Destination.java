package lab2;

/**
 * 
 * @author Alexandra
 *
 */
public class Destination {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @return String
	 */
	@Override
	// metoda toString generata de IDE
	/**
	 * @return String
	 */
	public String toString() {
		return "Destination [name=" + name + "]";
	}

	/**
	 * @return bool
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Destination) {
			if (((Destination) obj).name.equals(this.name)) {
				return true;
			}
			return false;
		}
		return false;
	}

}
