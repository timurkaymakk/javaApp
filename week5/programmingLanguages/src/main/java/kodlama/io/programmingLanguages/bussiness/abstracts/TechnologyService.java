package kodlama.io.programmingLanguages.bussiness.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.bussiness.requests.technologies.CreateTechnologyRequest;
import kodlama.io.programmingLanguages.bussiness.requests.technologies.DeleteTechnologyRequest;
import kodlama.io.programmingLanguages.bussiness.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.programmingLanguages.bussiness.responses.technologies.GetAllTechnologiesResponse;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void update(UpdateTechnologyRequest updateTechnologyRequest)throws Exception;
	void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;
}
