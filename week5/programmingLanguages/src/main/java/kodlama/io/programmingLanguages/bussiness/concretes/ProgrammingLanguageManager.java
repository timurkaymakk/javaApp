package kodlama.io.programmingLanguages.bussiness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.programmingLanguages.bussiness.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguages.bussiness.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.programmingLanguages.bussiness.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.programmingLanguages.bussiness.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.programmingLanguages.bussiness.responses.programmingLanguages.GetAllProgrammingLanguageResponse;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;

public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	ProgrammingLanguageRepository programmingLanguageRepository;
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();

		List<GetAllProgrammingLanguageResponse> languageResponse = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {

			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			languageResponse.add(responseItem);

		}
		return languageResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		if (createProgrammingLanguageRequest.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		else if(isNameExist(createProgrammingLanguageRequest.getName())) {
			throw new Exception("Programlama dili tekrar edemez.");
		}
		else {
			ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
			programmingLanguage.setName(createProgrammingLanguageRequest.getName());
			programmingLanguageRepository.save(programmingLanguage);
		}
		}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(updateProgrammingLanguageRequest.getId()).get();
		if (isNameExist(updateProgrammingLanguageRequest.getName())) {
			throw new Exception("Bu dil zaten kayıtlı");
		}
		if (isNameEmpty(updateProgrammingLanguageRequest.getName())) {
			throw new Exception("Dil ismi boş geçilemez");
		}
		
		programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguage);

	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception {
		if (!isIdExist(deleteProgrammingLanguageRequest.getId())) {
			throw new Exception("'Id' bulunamadı");
		}
		
		this.programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());

	}
	
	private boolean isNameExist(String name) {
		for (GetAllProgrammingLanguageResponse language : getAll()) {
			if (name.equals(language.getName())) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean isIdExist(int id) {
		for (GetAllProgrammingLanguageResponse language : getAll()) {
			if (language.getId() == id) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean isNameEmpty(String name) {
		if(name.isEmpty()) return true;
		
		return false;
	}

}
