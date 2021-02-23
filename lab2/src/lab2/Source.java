package lab2;

public class Source {
	private String name;
	private SourceType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SourceType getType() {
		return type;
	}

	public void setType(SourceType type) {
		this.type = type;
	}

	@Override
	//metoda toString generata de IDE
	public String toString() {
		return "Source [name=" + name + ", type=" + type + "]";
	}

}
