package EnginDemirogJavaOdev.Bolum3.businies;

import EnginDemirogJavaOdev.Bolum3.dao.Dao;
import EnginDemirogJavaOdev.Bolum3.dao.KategoriDao;
import EnginDemirogJavaOdev.Bolum3.entitie.Kategori;
import EnginDemirogJavaOdev.Bolum3.logging.Loger;

public class KategoriManager {
	private Dao kategoriDao;
	private Loger[] loger;

	public KategoriManager(Dao kategoriDao, Loger[] loger) {
		this.kategoriDao = kategoriDao;
		this.loger = loger;
	}

	public void add(Kategori kategori) {
		Kategori[] kategoris = { new Kategori("web"), new Kategori("mobil"), new Kategori("pc") };
		kategoriDao.add(kategori);
		for (Loger loger2 : loger) {
			loger2.log(kategori.getKategoriAdi());
		}
	}
}
