package EnginDemirogJavaOdev.Bolum3.entitie;

public class Kategori {
	private String kategoriAdi;

	public Kategori() {
		// TODO Auto-generated constructor stub
	}

	public Kategori(String kategoriAdi) {
		super();
		this.kategoriAdi = kategoriAdi;
	}

	public String getKategoriAdi() {
		return kategoriAdi;
	}

	public void setKategoriAdi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}

	@Override
	public String toString() {
		return getKategoriAdi();
	}
	

}
