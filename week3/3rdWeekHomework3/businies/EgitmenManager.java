package EnginDemirogJavaOdev.Bolum3.businies;

import EnginDemirogJavaOdev.Bolum3.dao.Dao;
import EnginDemirogJavaOdev.Bolum3.dao.EgitmenDao;
import EnginDemirogJavaOdev.Bolum3.entitie.Egitmen;
import EnginDemirogJavaOdev.Bolum3.logging.Loger;

public class EgitmenManager {
	private Dao egitmenDao;
	private Loger[] loger;

	public EgitmenManager(Dao egitmenDao, Loger[] loger) {
		this.egitmenDao = egitmenDao;
		this.loger = loger;
	}

	public void add(Egitmen egitmen) {
		egitmenDao.add(egitmen);
		for (Loger loger2 : loger) {
			loger2.log("egitmen ismi " + egitmen.getName()) ;
		}
	}

}
