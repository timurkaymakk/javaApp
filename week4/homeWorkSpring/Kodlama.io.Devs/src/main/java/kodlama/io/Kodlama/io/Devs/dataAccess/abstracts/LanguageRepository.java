package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language>getAll();
	void add(Language language);
	void delete(int id);
	void update(Language language,int id);
	Language getElementById(int id);
	boolean isValid(Language language);
	
}
