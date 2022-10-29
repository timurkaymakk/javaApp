package EnginDemirogJavaOdev.Bolum3.entitie;

public class Egitmen {
	@Override
	public String toString() {
		return getName();
	}

	private String tcNo;
	private String name;

	public Egitmen() {
		// TODO Auto-generated constructor stub
	}

	public Egitmen(String tcNo, String name) {
		super();
		this.tcNo = tcNo;
		this.name = name;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
