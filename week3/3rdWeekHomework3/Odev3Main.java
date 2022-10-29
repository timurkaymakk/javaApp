package EnginDemirogJavaOdev.Bolum3;

import EnginDemirogJavaOdev.Bolum3.businies.EgitmenManager;
import EnginDemirogJavaOdev.Bolum3.businies.KategoriManager;
import EnginDemirogJavaOdev.Bolum3.businies.KursManager;
import EnginDemirogJavaOdev.Bolum3.dao.Dao;
import EnginDemirogJavaOdev.Bolum3.dao.HibernateDao;
import EnginDemirogJavaOdev.Bolum3.dao.JDBCDao;
import EnginDemirogJavaOdev.Bolum3.dao.KategoriDao;
import EnginDemirogJavaOdev.Bolum3.entitie.Egitmen;
import EnginDemirogJavaOdev.Bolum3.entitie.Kategori;
import EnginDemirogJavaOdev.Bolum3.entitie.Kurs;
import EnginDemirogJavaOdev.Bolum3.logging.DataBaseLogger;
import EnginDemirogJavaOdev.Bolum3.logging.FileLogger;
import EnginDemirogJavaOdev.Bolum3.logging.Loger;
import EnginDemirogJavaOdev.Bolum3.logging.MailLogger;

public class Odev3Main {

	public static void main(String[] args) {
		Loger[] loggers = { new FileLogger(), new DataBaseLogger(), new MailLogger() };

		Kategori kategori1 = new Kategori("robotik");
		KategoriManager kategoriManager = new KategoriManager(new HibernateDao() {
		}, loggers);
		kategoriManager.add(kategori1);

		Kurs kurs1 = new Kurs("fluter", 1200, kategori1, new Egitmen("222", "egit11"));
		KursManager kursManager = new KursManager(new JDBCDao() {
		}, loggers);
		kursManager.add(kurs1);
		
		
		Egitmen egitmen = new Egitmen("333", "sbs");
		EgitmenManager egitmenManager= new EgitmenManager(new HibernateDao() {
		}, loggers);
		egitmenManager.add(egitmen);
	}

}
