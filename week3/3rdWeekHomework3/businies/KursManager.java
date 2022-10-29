package EnginDemirogJavaOdev.Bolum3.businies;

import EnginDemirogJavaOdev.Bolum3.dao.Dao;
import EnginDemirogJavaOdev.Bolum3.dao.KursDao;
import EnginDemirogJavaOdev.Bolum3.entitie.Egitmen;
import EnginDemirogJavaOdev.Bolum3.entitie.Kategori;
import EnginDemirogJavaOdev.Bolum3.entitie.Kurs;
import EnginDemirogJavaOdev.Bolum3.logging.Loger;

public class KursManager {
	private Dao kursDao;
	private Loger[] loger;

	public KursManager(Dao kursDao, Loger[] loger) {
		this.kursDao = kursDao;
		this.loger = loger;
	}

	public void add(Kurs kurs) {
		Kurs[] kurs1 = { new Kurs("java", 1000, new Kategori("mobil"), new Egitmen("123", "burak")),
				new Kurs("c#", 4000, new Kategori("web"), new Egitmen("123456", "þakir")),
				new Kurs("js", 1000, new Kategori("pc"), new Egitmen("789", "sabah")) };
		kursDao.add(kurs);
		for (Loger logers : loger) {
			logers.log("kurs ismi " + kurs.getKursAdi());
		}
	}
}
