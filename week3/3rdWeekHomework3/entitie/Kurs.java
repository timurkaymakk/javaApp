package EnginDemirogJavaOdev.Bolum3.entitie;

public class Kurs {
	@Override
	public String toString() {
		return getKursAdi();
	}

	private String kursAdi;
	private double kursFiyati;
	private Kategori kategori;
	private Egitmen egitmen;

	public Kurs(String kursAdi, double kursFiyati, Kategori kategori, Egitmen egitmen) {
		this.kursAdi = kursAdi;
		this.kursFiyati = kursFiyati;
		this.kategori = kategori;
		this.egitmen = egitmen;
	}

	public Kurs() {
		// TODO Auto-generated constructor stub
	}

	public String getKursAdi() {
		return kursAdi;
	}

	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public double getKursFiyati() {
		return kursFiyati;
	}

	public void setKursFiyati(double kursFiyati) {
		this.kursFiyati = kursFiyati;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	public Egitmen getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(Egitmen egitmen) {
		this.egitmen = egitmen;
	}

}
