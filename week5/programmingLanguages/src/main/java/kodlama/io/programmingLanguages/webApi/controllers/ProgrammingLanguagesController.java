package kodlama.io.programmingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguages.bussiness.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguages.bussiness.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.programmingLanguages.bussiness.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.programmingLanguages.bussiness.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import kodlama.io.programmingLanguages.bussiness.responses.programmingLanguages.GetAllProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll() {
		return programmingLanguageService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		this.programmingLanguageService.add(createProgrammingLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteLanguageRequest) throws Exception {
		this.programmingLanguageService.delete(deleteLanguageRequest);
	}

	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateLanguageRequest) throws Exception {
		this.programmingLanguageService.update(updateLanguageRequest);
	}
}
