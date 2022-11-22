package kodlama.io.programmingLanguages.bussiness.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateTechnologyRequest {
	private int programmingLanguageId;
	private String name;
}
