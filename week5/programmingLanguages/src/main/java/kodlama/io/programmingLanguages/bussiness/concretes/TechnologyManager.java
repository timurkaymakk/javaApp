package kodlama.io.programmingLanguages.bussiness.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.programmingLanguages.bussiness.abstracts.TechnologyService;
import kodlama.io.programmingLanguages.bussiness.requests.technologies.CreateTechnologyRequest;
import kodlama.io.programmingLanguages.bussiness.requests.technologies.DeleteTechnologyRequest;
import kodlama.io.programmingLanguages.bussiness.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.programmingLanguages.bussiness.responses.technologies.GetAllTechnologiesResponse;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguages.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;
import kodlama.io.programmingLanguages.entities.concretes.Technology;

public class TechnologyManager implements TechnologyService {


	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository,
			ProgrammingLanguageRepository programmingLanguageRepository) {
		this.technologyRepository = technologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesReponses = new ArrayList<GetAllTechnologiesResponse>();
		for (Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			technologiesReponses.add(responseItem);
		}
		return technologiesReponses;

	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(createTechnologyRequest.getProgrammingLanguageId()).get();
		
		if (createTechnologyRequest.getName().isEmpty()) {
			throw new Exception("Teknoloji ismi boş geçilemez");
		}
		else if(isNameExist(createTechnologyRequest.getName())) {
			throw new Exception("Teknoloji ismi tekrar edemez");
		}
		else {
			technology.setName(createTechnologyRequest.getName());
			technology.setProgrammingLanguage(programmingLanguage);
			technologyRepository.save(technology);
		}
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		Technology technology = this.technologyRepository.findById(updateTechnologyRequest.getId()).get();
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
		
		if (isNameExist(updateTechnologyRequest.getName())) {
			throw new Exception("Bu dil zaten kayıtlı");
			
		}
		if (isNameEmpty(updateTechnologyRequest.getName())) {
			throw new Exception("Dil ismi boş geçilemez");
		}
		
		technology.setName(updateTechnologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		this.technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		if (!isIdExist(deleteTechnologyRequest.getId())) {
			throw new Exception("'Id' bulunamadı");
		}
		this.technologyRepository.deleteById(deleteTechnologyRequest.getId());
	}

	private boolean isNameExist(String name) {
		
		for (GetAllTechnologiesResponse getTechnologiesResponse : getAll()) {
			
			if (name.equals(getTechnologiesResponse.getName())) {
				return true;
			}

		}
		return false;

	}

	private boolean isIdExist(int id) {
		
		for (GetAllTechnologiesResponse technology : getAll()) {
			
			if (technology.getId() == id)
				return true;
		}
		return false;
	}

	private boolean isNameEmpty(String name) {
		
		if (name.isEmpty())
			return true;

		return false;
	}

}
