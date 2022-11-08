package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}
	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);

	}
	@DeleteMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
	}
	@PutMapping("/update")
	public void update(Language language) throws Exception {
		languageService.update(language, 0);
	}
	@GetMapping("/getById")
	public Language getById(int Id) {
		return languageService.getElementById(Id);

	}
}
