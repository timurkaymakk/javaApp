package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language>languages;
	
	public InMemoryLanguageRepository() {
		languages=new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Phyton"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void delete(int id) {
	for(Language languageVar:languages) {
		if(languageVar.getId()==id) {
			languages.remove(id); 
		}
	}
	}


	@Override
	public Language getElementById(int id)  {

		for(Language languageVar2:languages) {
			if(languageVar2.getId()==id) {
				return languageVar2;
			}
		}
		return null;
	}

	@Override
	public void update(Language language, int id) {
		Language languagevar2=getElementById(language.getId());
		languagevar2.setName(language.getName());
		
	}

	@Override
	public boolean isValid(Language language) {
		
		return false;
	}

}
