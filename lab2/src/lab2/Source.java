package lab2;

/**
 * 
 * @author Alexandra
 *
 */
public abstract class Source {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getType();

	/**
	 * 
	 * @return String
	 *
	 */
	@Override
	// metoda toString generata de IDE
	public String toString() {
		return "Source [name=" + name + ", type=" + getType() + "]";
	}

	/**
	 * @return bool
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Source) {
			if (((Source) obj).name.equals(this.name) && ((Source) obj).getType().equals(this.getType())) {
				return true;
			}
			return false;
		}
		return false;
	}

}
