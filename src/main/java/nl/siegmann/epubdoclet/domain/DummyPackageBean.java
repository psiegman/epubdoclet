package nl.siegmann.epubdoclet.domain;

public class DummyPackageBean {

	private String name;
	
	public DummyPackageBean(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	private String description;
	
	public String name() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String description() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
